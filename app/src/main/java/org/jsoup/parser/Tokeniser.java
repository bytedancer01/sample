package org.jsoup.parser;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.Arrays;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.Token;

/* loaded from: combined.jar:classes3.jar:org/jsoup/parser/Tokeniser.class */
final class Tokeniser {
    private static final char[] notCharRefCharsSorted;
    public static final char replacementChar = 65533;
    private Token emitPending;
    private ParseErrorList errors;
    private String lastStartTag;
    private CharacterReader reader;
    public Token.Tag tagPending;
    private TokeniserState state = TokeniserState.Data;
    private boolean isEmitPending = false;
    private String charsString = null;
    private StringBuilder charsBuilder = new StringBuilder(1024);
    public StringBuilder dataBuffer = new StringBuilder(1024);
    public Token.StartTag startPending = new Token.StartTag();
    public Token.EndTag endPending = new Token.EndTag();
    public Token.Character charPending = new Token.Character();
    public Token.Doctype doctypePending = new Token.Doctype();
    public Token.Comment commentPending = new Token.Comment();
    private boolean selfClosingFlagAcknowledged = true;
    private final char[] charRefHolder = new char[1];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        notCharRefCharsSorted = cArr;
        Arrays.sort(cArr);
    }

    public Tokeniser(CharacterReader characterReader, ParseErrorList parseErrorList) {
        this.reader = characterReader;
        this.errors = parseErrorList;
    }

    private void characterReferenceError(String str) {
        if (this.errors.canAddError()) {
            this.errors.add(new ParseError(this.reader.pos(), "Invalid character reference: %s", str));
        }
    }

    private void error(String str) {
        if (this.errors.canAddError()) {
            this.errors.add(new ParseError(this.reader.pos(), str));
        }
    }

    public void acknowledgeSelfClosingFlag() {
        this.selfClosingFlagAcknowledged = true;
    }

    public void advanceTransition(TokeniserState tokeniserState) {
        this.reader.advance();
        this.state = tokeniserState;
    }

    public String appropriateEndTagName() {
        String str = this.lastStartTag;
        String str2 = str;
        if (str == null) {
            str2 = null;
        }
        return str2;
    }

    public char[] consumeCharacterReference(Character ch2, boolean z10) {
        int i10;
        if (this.reader.isEmpty()) {
            return null;
        }
        if ((ch2 != null && ch2.charValue() == this.reader.current()) || this.reader.matchesAnySorted(notCharRefCharsSorted)) {
            return null;
        }
        char[] cArr = this.charRefHolder;
        this.reader.mark();
        if (this.reader.matchConsume(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER)) {
            boolean matchConsumeIgnoreCase = this.reader.matchConsumeIgnoreCase("X");
            CharacterReader characterReader = this.reader;
            String consumeHexSequence = matchConsumeIgnoreCase ? characterReader.consumeHexSequence() : characterReader.consumeDigitSequence();
            if (consumeHexSequence.length() != 0) {
                if (!this.reader.matchConsume(";")) {
                    characterReferenceError("missing semicolon");
                }
                try {
                    i10 = Integer.valueOf(consumeHexSequence, matchConsumeIgnoreCase ? 16 : 10).intValue();
                } catch (NumberFormatException e10) {
                    i10 = -1;
                }
                if (i10 == -1 || ((i10 >= 55296 && i10 <= 57343) || i10 > 1114111)) {
                    characterReferenceError("character outside of valid range");
                    cArr[0] = 65533;
                    return cArr;
                }
                if (i10 >= 65536) {
                    return Character.toChars(i10);
                }
                cArr[0] = (char) i10;
                return cArr;
            }
            characterReferenceError("numeric reference with no numerals");
        } else {
            String consumeLetterThenDigitSequence = this.reader.consumeLetterThenDigitSequence();
            boolean matches = this.reader.matches(';');
            if (!(Entities.isBaseNamedEntity(consumeLetterThenDigitSequence) || (Entities.isNamedEntity(consumeLetterThenDigitSequence) && matches))) {
                this.reader.rewindToMark();
                if (!matches) {
                    return null;
                }
                characterReferenceError(String.format("invalid named referenece '%s'", consumeLetterThenDigitSequence));
                return null;
            }
            if (!z10 || (!this.reader.matchesLetter() && !this.reader.matchesDigit() && !this.reader.matchesAny('=', '-', '_'))) {
                if (!this.reader.matchConsume(";")) {
                    characterReferenceError("missing semicolon");
                }
                cArr[0] = Entities.getCharacterByName(consumeLetterThenDigitSequence).charValue();
                return cArr;
            }
        }
        this.reader.rewindToMark();
        return null;
    }

    public void createCommentPending() {
        this.commentPending.reset();
    }

    public void createDoctypePending() {
        this.doctypePending.reset();
    }

    public Token.Tag createTagPending(boolean z10) {
        Token.Tag reset = z10 ? this.startPending.reset() : this.endPending.reset();
        this.tagPending = reset;
        return reset;
    }

    public void createTempBuffer() {
        Token.reset(this.dataBuffer);
    }

    public boolean currentNodeInHtmlNS() {
        return true;
    }

    public void emit(char c10) {
        emit(String.valueOf(c10));
    }

    public void emit(String str) {
        if (this.charsString == null) {
            this.charsString = str;
            return;
        }
        if (this.charsBuilder.length() == 0) {
            this.charsBuilder.append(this.charsString);
        }
        this.charsBuilder.append(str);
    }

    public void emit(Token token) {
        Validate.isFalse(this.isEmitPending, "There is an unread token pending!");
        this.emitPending = token;
        this.isEmitPending = true;
        Token.TokenType tokenType = token.type;
        if (tokenType != Token.TokenType.StartTag) {
            if (tokenType != Token.TokenType.EndTag || ((Token.EndTag) token).attributes == null) {
                return;
            }
            error("Attributes incorrectly present on end tag");
            return;
        }
        Token.StartTag startTag = (Token.StartTag) token;
        this.lastStartTag = startTag.tagName;
        if (startTag.selfClosing) {
            this.selfClosingFlagAcknowledged = false;
        }
    }

    public void emit(char[] cArr) {
        emit(String.valueOf(cArr));
    }

    public void emitCommentPending() {
        emit(this.commentPending);
    }

    public void emitDoctypePending() {
        emit(this.doctypePending);
    }

    public void emitTagPending() {
        this.tagPending.finaliseTag();
        emit(this.tagPending);
    }

    public void eofError(TokeniserState tokeniserState) {
        if (this.errors.canAddError()) {
            this.errors.add(new ParseError(this.reader.pos(), "Unexpectedly reached end of file (EOF) in input state [%s]", tokeniserState));
        }
    }

    public void error(TokeniserState tokeniserState) {
        if (this.errors.canAddError()) {
            this.errors.add(new ParseError(this.reader.pos(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.reader.current()), tokeniserState));
        }
    }

    public TokeniserState getState() {
        return this.state;
    }

    public boolean isAppropriateEndTagToken() {
        String str = this.lastStartTag;
        return str != null && this.tagPending.tagName.equals(str);
    }

    public Token read() {
        if (!this.selfClosingFlagAcknowledged) {
            error("Self closing flag not acknowledged");
            this.selfClosingFlagAcknowledged = true;
        }
        while (!this.isEmitPending) {
            this.state.read(this, this.reader);
        }
        if (this.charsBuilder.length() > 0) {
            String sb2 = this.charsBuilder.toString();
            StringBuilder sb3 = this.charsBuilder;
            sb3.delete(0, sb3.length());
            this.charsString = null;
            return this.charPending.data(sb2);
        }
        String str = this.charsString;
        if (str == null) {
            this.isEmitPending = false;
            return this.emitPending;
        }
        Token.Character data = this.charPending.data(str);
        this.charsString = null;
        return data;
    }

    public void transition(TokeniserState tokeniserState) {
        this.state = tokeniserState;
    }

    public String unescapeEntities(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        while (!this.reader.isEmpty()) {
            sb2.append(this.reader.consumeTo('&'));
            if (this.reader.matches('&')) {
                this.reader.consume();
                char[] consumeCharacterReference = consumeCharacterReference(null, z10);
                if (consumeCharacterReference == null || consumeCharacterReference.length == 0) {
                    sb2.append('&');
                } else {
                    sb2.append(consumeCharacterReference);
                }
            }
        }
        return sb2.toString();
    }
}
