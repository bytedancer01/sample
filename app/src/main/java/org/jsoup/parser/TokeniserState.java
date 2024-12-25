package org.jsoup.parser;

import java.util.Arrays;
import org.jsoup.parser.Token;

/* loaded from: combined.jar:classes3.jar:org/jsoup/parser/TokeniserState.class */
enum TokeniserState {
    Data { // from class: org.jsoup.parser.TokeniserState.1
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char current = characterReader.current();
            if (current == 0) {
                tokeniser.error(this);
                tokeniser.emit(characterReader.consume());
                return;
            }
            if (current == '&') {
                tokeniserState = TokeniserState.CharacterReferenceInData;
            } else {
                if (current != '<') {
                    if (current != 65535) {
                        tokeniser.emit(characterReader.consumeData());
                        return;
                    } else {
                        tokeniser.emit(new Token.EOF());
                        return;
                    }
                }
                tokeniserState = TokeniserState.TagOpen;
            }
            tokeniser.advanceTransition(tokeniserState);
        }
    },
    CharacterReferenceInData { // from class: org.jsoup.parser.TokeniserState.2
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char[] consumeCharacterReference = tokeniser.consumeCharacterReference(null, false);
            if (consumeCharacterReference == null) {
                tokeniser.emit('&');
            } else {
                tokeniser.emit(consumeCharacterReference);
            }
            tokeniser.transition(TokeniserState.Data);
        }
    },
    Rcdata { // from class: org.jsoup.parser.TokeniserState.3
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char current = characterReader.current();
            if (current == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.emit((char) 65533);
                return;
            }
            if (current == '&') {
                tokeniserState = TokeniserState.CharacterReferenceInRcdata;
            } else {
                if (current != '<') {
                    if (current != 65535) {
                        tokeniser.emit(characterReader.consumeToAny('&', '<', 0));
                        return;
                    } else {
                        tokeniser.emit(new Token.EOF());
                        return;
                    }
                }
                tokeniserState = TokeniserState.RcdataLessthanSign;
            }
            tokeniser.advanceTransition(tokeniserState);
        }
    },
    CharacterReferenceInRcdata { // from class: org.jsoup.parser.TokeniserState.4
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char[] consumeCharacterReference = tokeniser.consumeCharacterReference(null, false);
            if (consumeCharacterReference == null) {
                tokeniser.emit('&');
            } else {
                tokeniser.emit(consumeCharacterReference);
            }
            tokeniser.transition(TokeniserState.Rcdata);
        }
    },
    Rawtext { // from class: org.jsoup.parser.TokeniserState.5
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.emit((char) 65533);
            } else if (current == '<') {
                tokeniser.advanceTransition(TokeniserState.RawtextLessthanSign);
            } else if (current != 65535) {
                tokeniser.emit(characterReader.consumeToAny('<', 0));
            } else {
                tokeniser.emit(new Token.EOF());
            }
        }
    },
    ScriptData { // from class: org.jsoup.parser.TokeniserState.6
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.emit((char) 65533);
            } else if (current == '<') {
                tokeniser.advanceTransition(TokeniserState.ScriptDataLessthanSign);
            } else if (current != 65535) {
                tokeniser.emit(characterReader.consumeToAny('<', 0));
            } else {
                tokeniser.emit(new Token.EOF());
            }
        }
    },
    PLAINTEXT { // from class: org.jsoup.parser.TokeniserState.7
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.emit((char) 65533);
            } else if (current != 65535) {
                tokeniser.emit(characterReader.consumeTo((char) 0));
            } else {
                tokeniser.emit(new Token.EOF());
            }
        }
    },
    TagOpen { // from class: org.jsoup.parser.TokeniserState.8
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            TokeniserState tokeniserState2;
            char current = characterReader.current();
            if (current == '!') {
                tokeniserState = TokeniserState.MarkupDeclarationOpen;
            } else if (current == '/') {
                tokeniserState = TokeniserState.EndTagOpen;
            } else {
                if (current != '?') {
                    if (characterReader.matchesLetter()) {
                        tokeniser.createTagPending(true);
                        tokeniserState2 = TokeniserState.TagName;
                    } else {
                        tokeniser.error(this);
                        tokeniser.emit('<');
                        tokeniserState2 = TokeniserState.Data;
                    }
                    tokeniser.transition(tokeniserState2);
                    return;
                }
                tokeniserState = TokeniserState.BogusComment;
            }
            tokeniser.advanceTransition(tokeniserState);
        }
    },
    EndTagOpen { // from class: org.jsoup.parser.TokeniserState.9
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.emit("</");
                tokeniserState = TokeniserState.Data;
            } else {
                if (!characterReader.matchesLetter()) {
                    boolean matches = characterReader.matches('>');
                    tokeniser.error(this);
                    tokeniser.advanceTransition(matches ? TokeniserState.Data : TokeniserState.BogusComment);
                    return;
                }
                tokeniser.createTagPending(false);
                tokeniserState = TokeniserState.TagName;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    TagName { // from class: org.jsoup.parser.TokeniserState.10
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            tokeniser.tagPending.appendTagName(characterReader.consumeTagName().toLowerCase());
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.tagPending.appendTagName(TokeniserState.replacementStr);
                return;
            }
            if (consume != ' ') {
                if (consume != '/') {
                    if (consume == '>') {
                        tokeniser.emitTagPending();
                    } else if (consume == 65535) {
                        tokeniser.eofError(this);
                    } else if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r') {
                        return;
                    }
                    tokeniserState = TokeniserState.Data;
                } else {
                    tokeniserState = TokeniserState.SelfClosingStartTag;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniserState = TokeniserState.BeforeAttributeName;
            tokeniser.transition(tokeniserState);
        }
    },
    RcdataLessthanSign { // from class: org.jsoup.parser.TokeniserState.11
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.matches('/')) {
                tokeniser.createTempBuffer();
                tokeniser.advanceTransition(TokeniserState.RCDATAEndTagOpen);
                return;
            }
            if (characterReader.matchesLetter() && tokeniser.appropriateEndTagName() != null) {
                if (!characterReader.containsIgnoreCase("</" + tokeniser.appropriateEndTagName())) {
                    tokeniser.tagPending = tokeniser.createTagPending(false).name(tokeniser.appropriateEndTagName());
                    tokeniser.emitTagPending();
                    characterReader.unconsume();
                    tokeniserState = TokeniserState.Data;
                    tokeniser.transition(tokeniserState);
                }
            }
            tokeniser.emit("<");
            tokeniserState = TokeniserState.Rcdata;
            tokeniser.transition(tokeniserState);
        }
    },
    RCDATAEndTagOpen { // from class: org.jsoup.parser.TokeniserState.12
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.matchesLetter()) {
                tokeniser.emit("</");
                tokeniser.transition(TokeniserState.Rcdata);
            } else {
                tokeniser.createTagPending(false);
                tokeniser.tagPending.appendTagName(Character.toLowerCase(characterReader.current()));
                tokeniser.dataBuffer.append(Character.toLowerCase(characterReader.current()));
                tokeniser.advanceTransition(TokeniserState.RCDATAEndTagName);
            }
        }
    },
    RCDATAEndTagName { // from class: org.jsoup.parser.TokeniserState.13
        private void anythingElse(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.emit("</" + tokeniser.dataBuffer.toString());
            characterReader.unconsume();
            tokeniser.transition(TokeniserState.Rcdata);
        }

        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.matchesLetter()) {
                String consumeLetterSequence = characterReader.consumeLetterSequence();
                tokeniser.tagPending.appendTagName(consumeLetterSequence.toLowerCase());
                tokeniser.dataBuffer.append(consumeLetterSequence);
                return;
            }
            char consume = characterReader.consume();
            if (consume == '\t' || consume == '\n' || consume == '\f' || consume == '\r' || consume == ' ') {
                if (tokeniser.isAppropriateEndTagToken()) {
                    tokeniserState = TokeniserState.BeforeAttributeName;
                    tokeniser.transition(tokeniserState);
                    return;
                }
                anythingElse(tokeniser, characterReader);
            }
            if (consume == '/') {
                if (tokeniser.isAppropriateEndTagToken()) {
                    tokeniserState = TokeniserState.SelfClosingStartTag;
                    tokeniser.transition(tokeniserState);
                    return;
                }
                anythingElse(tokeniser, characterReader);
            }
            if (consume == '>' && tokeniser.isAppropriateEndTagToken()) {
                tokeniser.emitTagPending();
                tokeniserState = TokeniserState.Data;
                tokeniser.transition(tokeniserState);
                return;
            }
            anythingElse(tokeniser, characterReader);
        }
    },
    RawtextLessthanSign { // from class: org.jsoup.parser.TokeniserState.14
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('/')) {
                tokeniser.createTempBuffer();
                tokeniser.advanceTransition(TokeniserState.RawtextEndTagOpen);
            } else {
                tokeniser.emit('<');
                tokeniser.transition(TokeniserState.Rawtext);
            }
        }
    },
    RawtextEndTagOpen { // from class: org.jsoup.parser.TokeniserState.15
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.matchesLetter()) {
                tokeniser.createTagPending(false);
                tokeniserState = TokeniserState.RawtextEndTagName;
            } else {
                tokeniser.emit("</");
                tokeniserState = TokeniserState.Rawtext;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    RawtextEndTagName { // from class: org.jsoup.parser.TokeniserState.16
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataEndTag(tokeniser, characterReader, TokeniserState.Rawtext);
        }
    },
    ScriptDataLessthanSign { // from class: org.jsoup.parser.TokeniserState.17
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume == '!') {
                tokeniser.emit("<!");
                tokeniserState = TokeniserState.ScriptDataEscapeStart;
            } else if (consume != '/') {
                tokeniser.emit("<");
                characterReader.unconsume();
                tokeniserState = TokeniserState.ScriptData;
            } else {
                tokeniser.createTempBuffer();
                tokeniserState = TokeniserState.ScriptDataEndTagOpen;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    ScriptDataEndTagOpen { // from class: org.jsoup.parser.TokeniserState.18
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.matchesLetter()) {
                tokeniser.createTagPending(false);
                tokeniserState = TokeniserState.ScriptDataEndTagName;
            } else {
                tokeniser.emit("</");
                tokeniserState = TokeniserState.ScriptData;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    ScriptDataEndTagName { // from class: org.jsoup.parser.TokeniserState.19
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataEndTag(tokeniser, characterReader, TokeniserState.ScriptData);
        }
    },
    ScriptDataEscapeStart { // from class: org.jsoup.parser.TokeniserState.20
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.matches('-')) {
                tokeniser.transition(TokeniserState.ScriptData);
            } else {
                tokeniser.emit('-');
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapeStartDash);
            }
        }
    },
    ScriptDataEscapeStartDash { // from class: org.jsoup.parser.TokeniserState.21
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.matches('-')) {
                tokeniser.transition(TokeniserState.ScriptData);
            } else {
                tokeniser.emit('-');
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedDashDash);
            }
        }
    },
    ScriptDataEscaped { // from class: org.jsoup.parser.TokeniserState.22
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            char current = characterReader.current();
            if (current == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.emit((char) 65533);
                return;
            }
            if (current == '-') {
                tokeniser.emit('-');
                tokeniserState = TokeniserState.ScriptDataEscapedDash;
            } else {
                if (current != '<') {
                    tokeniser.emit(characterReader.consumeToAny('-', '<', 0));
                    return;
                }
                tokeniserState = TokeniserState.ScriptDataEscapedLessthanSign;
            }
            tokeniser.advanceTransition(tokeniserState);
        }
    },
    ScriptDataEscapedDash { // from class: org.jsoup.parser.TokeniserState.23
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume == '-') {
                    tokeniser.emit(consume);
                    tokeniserState = TokeniserState.ScriptDataEscapedDashDash;
                } else if (consume == '<') {
                    tokeniserState = TokeniserState.ScriptDataEscapedLessthanSign;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            consume = 65533;
            tokeniser.emit(consume);
            tokeniserState = TokeniserState.ScriptDataEscaped;
            tokeniser.transition(tokeniserState);
        }
    },
    ScriptDataEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.24
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume == '-') {
                    tokeniser.emit(consume);
                    return;
                }
                if (consume != '<') {
                    tokeniser.emit(consume);
                    if (consume == '>') {
                        tokeniserState = TokeniserState.ScriptData;
                    }
                } else {
                    tokeniserState = TokeniserState.ScriptDataEscapedLessthanSign;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            tokeniser.emit((char) 65533);
            tokeniserState = TokeniserState.ScriptDataEscaped;
            tokeniser.transition(tokeniserState);
        }
    },
    ScriptDataEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.25
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.matchesLetter()) {
                tokeniser.createTempBuffer();
                tokeniser.dataBuffer.append(Character.toLowerCase(characterReader.current()));
                tokeniser.emit("<" + characterReader.current());
                tokeniserState = TokeniserState.ScriptDataDoubleEscapeStart;
            } else if (!characterReader.matches('/')) {
                tokeniser.emit('<');
                tokeniser.transition(TokeniserState.ScriptDataEscaped);
                return;
            } else {
                tokeniser.createTempBuffer();
                tokeniserState = TokeniserState.ScriptDataEscapedEndTagOpen;
            }
            tokeniser.advanceTransition(tokeniserState);
        }
    },
    ScriptDataEscapedEndTagOpen { // from class: org.jsoup.parser.TokeniserState.26
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.matchesLetter()) {
                tokeniser.emit("</");
                tokeniser.transition(TokeniserState.ScriptDataEscaped);
            } else {
                tokeniser.createTagPending(false);
                tokeniser.tagPending.appendTagName(Character.toLowerCase(characterReader.current()));
                tokeniser.dataBuffer.append(characterReader.current());
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedEndTagName);
            }
        }
    },
    ScriptDataEscapedEndTagName { // from class: org.jsoup.parser.TokeniserState.27
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataEndTag(tokeniser, characterReader, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart { // from class: org.jsoup.parser.TokeniserState.28
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataDoubleEscapeTag(tokeniser, characterReader, TokeniserState.ScriptDataDoubleEscaped, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped { // from class: org.jsoup.parser.TokeniserState.29
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char current = characterReader.current();
            if (current == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.emit((char) 65533);
                return;
            }
            if (current == '-') {
                tokeniser.emit(current);
                tokeniserState = TokeniserState.ScriptDataDoubleEscapedDash;
            } else {
                if (current != '<') {
                    if (current != 65535) {
                        tokeniser.emit(characterReader.consumeToAny('-', '<', 0));
                        return;
                    } else {
                        tokeniser.eofError(this);
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    }
                }
                tokeniser.emit(current);
                tokeniserState = TokeniserState.ScriptDataDoubleEscapedLessthanSign;
            }
            tokeniser.advanceTransition(tokeniserState);
        }
    },
    ScriptDataDoubleEscapedDash { // from class: org.jsoup.parser.TokeniserState.30
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume == '-') {
                    tokeniser.emit(consume);
                    tokeniserState = TokeniserState.ScriptDataDoubleEscapedDashDash;
                } else if (consume == '<') {
                    tokeniser.emit(consume);
                    tokeniserState = TokeniserState.ScriptDataDoubleEscapedLessthanSign;
                } else if (consume == 65535) {
                    tokeniser.eofError(this);
                    tokeniserState = TokeniserState.Data;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            consume = 65533;
            tokeniser.emit(consume);
            tokeniserState = TokeniserState.ScriptDataDoubleEscaped;
            tokeniser.transition(tokeniserState);
        }
    },
    ScriptDataDoubleEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.31
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume == '-') {
                    tokeniser.emit(consume);
                    return;
                }
                if (consume == '<') {
                    tokeniser.emit(consume);
                    tokeniserState = TokeniserState.ScriptDataDoubleEscapedLessthanSign;
                } else if (consume == '>') {
                    tokeniser.emit(consume);
                    tokeniserState = TokeniserState.ScriptData;
                } else if (consume == 65535) {
                    tokeniser.eofError(this);
                    tokeniserState = TokeniserState.Data;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            consume = 65533;
            tokeniser.emit(consume);
            tokeniserState = TokeniserState.ScriptDataDoubleEscaped;
            tokeniser.transition(tokeniserState);
        }
    },
    ScriptDataDoubleEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.32
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.matches('/')) {
                tokeniser.transition(TokeniserState.ScriptDataDoubleEscaped);
                return;
            }
            tokeniser.emit('/');
            tokeniser.createTempBuffer();
            tokeniser.advanceTransition(TokeniserState.ScriptDataDoubleEscapeEnd);
        }
    },
    ScriptDataDoubleEscapeEnd { // from class: org.jsoup.parser.TokeniserState.33
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataDoubleEscapeTag(tokeniser, characterReader, TokeniserState.ScriptDataEscaped, TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName { // from class: org.jsoup.parser.TokeniserState.34
        /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0040. Please report as an issue. */
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != ' ') {
                    if (consume != '\"' && consume != '\'') {
                        if (consume != '/') {
                            if (consume == 65535) {
                                tokeniser.eofError(this);
                            } else if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r') {
                                switch (consume) {
                                    case '>':
                                        tokeniser.emitTagPending();
                                        break;
                                }
                            } else {
                                return;
                            }
                            tokeniserState = TokeniserState.Data;
                        } else {
                            tokeniserState = TokeniserState.SelfClosingStartTag;
                        }
                        tokeniser.transition(tokeniserState);
                    }
                    tokeniser.error(this);
                    tokeniser.tagPending.newAttribute();
                    tokeniser.tagPending.appendAttributeName(consume);
                    tokeniserState = TokeniserState.AttributeName;
                    tokeniser.transition(tokeniserState);
                }
                return;
            }
            tokeniser.error(this);
            tokeniser.tagPending.newAttribute();
            characterReader.unconsume();
            tokeniserState = TokeniserState.AttributeName;
            tokeniser.transition(tokeniserState);
        }
    },
    AttributeName { // from class: org.jsoup.parser.TokeniserState.35
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            Token.Tag tag;
            TokeniserState tokeniserState;
            tokeniser.tagPending.appendAttributeName(characterReader.consumeToAnySorted(TokeniserState.attributeNameCharsSorted).toLowerCase());
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != ' ') {
                    if (consume != '\"' && consume != '\'') {
                        if (consume != '/') {
                            if (consume == 65535) {
                                tokeniser.eofError(this);
                            } else if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r') {
                                switch (consume) {
                                    case '=':
                                        tokeniserState = TokeniserState.BeforeAttributeValue;
                                        break;
                                    case '>':
                                        tokeniser.emitTagPending();
                                        break;
                                }
                            }
                            tokeniserState = TokeniserState.Data;
                        } else {
                            tokeniserState = TokeniserState.SelfClosingStartTag;
                        }
                        tokeniser.transition(tokeniserState);
                        return;
                    }
                    tokeniser.error(this);
                    tag = tokeniser.tagPending;
                }
                tokeniserState = TokeniserState.AfterAttributeName;
                tokeniser.transition(tokeniserState);
                return;
            }
            tokeniser.error(this);
            tag = tokeniser.tagPending;
            consume = 65533;
            tag.appendAttributeName(consume);
        }
    },
    AfterAttributeName { // from class: org.jsoup.parser.TokeniserState.36
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            Token.Tag tag;
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error(this);
                tag = tokeniser.tagPending;
                consume = 65533;
            } else {
                if (consume == ' ') {
                    return;
                }
                if (consume != '\"' && consume != '\'') {
                    if (consume != '/') {
                        if (consume == 65535) {
                            tokeniser.eofError(this);
                        } else if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r') {
                            switch (consume) {
                                case '<':
                                    break;
                                case '=':
                                    tokeniserState = TokeniserState.BeforeAttributeValue;
                                    break;
                                case '>':
                                    tokeniser.emitTagPending();
                                    break;
                                default:
                                    tokeniser.tagPending.newAttribute();
                                    characterReader.unconsume();
                                    tokeniserState = TokeniserState.AttributeName;
                                    break;
                            }
                        } else {
                            return;
                        }
                        tokeniserState = TokeniserState.Data;
                    } else {
                        tokeniserState = TokeniserState.SelfClosingStartTag;
                    }
                    tokeniser.transition(tokeniserState);
                }
                tokeniser.error(this);
                tokeniser.tagPending.newAttribute();
                tag = tokeniser.tagPending;
            }
            tag.appendAttributeName(consume);
            tokeniserState = TokeniserState.AttributeName;
            tokeniser.transition(tokeniserState);
        }
    },
    BeforeAttributeValue { // from class: org.jsoup.parser.TokeniserState.37
        /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0046. Please report as an issue. */
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            Token.Tag tag;
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != ' ') {
                    if (consume != '\"') {
                        if (consume != '`') {
                            if (consume == 65535) {
                                tokeniser.eofError(this);
                            } else {
                                if (consume == '\t' || consume == '\n' || consume == '\f' || consume == '\r') {
                                    return;
                                }
                                if (consume != '&') {
                                    if (consume != '\'') {
                                        switch (consume) {
                                            case '>':
                                                tokeniser.error(this);
                                                break;
                                        }
                                    } else {
                                        tokeniserState = TokeniserState.AttributeValue_singleQuoted;
                                    }
                                }
                                characterReader.unconsume();
                                tokeniserState = TokeniserState.AttributeValue_unquoted;
                            }
                            tokeniser.emitTagPending();
                            tokeniserState = TokeniserState.Data;
                        }
                        tokeniser.error(this);
                        tag = tokeniser.tagPending;
                    } else {
                        tokeniserState = TokeniserState.AttributeValue_doubleQuoted;
                    }
                    tokeniser.transition(tokeniserState);
                }
                return;
            }
            tokeniser.error(this);
            tag = tokeniser.tagPending;
            consume = 65533;
            tag.appendAttributeValue(consume);
            tokeniserState = TokeniserState.AttributeValue_unquoted;
            tokeniser.transition(tokeniserState);
        }
    },
    AttributeValue_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.38
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            String consumeToAnySorted = characterReader.consumeToAnySorted(TokeniserState.attributeDoubleValueCharsSorted);
            if (consumeToAnySorted.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(consumeToAnySorted);
            } else {
                tokeniser.tagPending.setEmptyAttributeValue();
            }
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeValue((char) 65533);
                return;
            }
            if (consume == '\"') {
                tokeniserState = TokeniserState.AfterAttributeValue_quoted;
            } else {
                if (consume == '&') {
                    char[] consumeCharacterReference = tokeniser.consumeCharacterReference('\"', true);
                    Token.Tag tag = tokeniser.tagPending;
                    if (consumeCharacterReference != null) {
                        tag.appendAttributeValue(consumeCharacterReference);
                        return;
                    } else {
                        tag.appendAttributeValue('&');
                        return;
                    }
                }
                if (consume != 65535) {
                    return;
                }
                tokeniser.eofError(this);
                tokeniserState = TokeniserState.Data;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    AttributeValue_singleQuoted { // from class: org.jsoup.parser.TokeniserState.39
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            String consumeToAnySorted = characterReader.consumeToAnySorted(TokeniserState.attributeSingleValueCharsSorted);
            if (consumeToAnySorted.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(consumeToAnySorted);
            } else {
                tokeniser.tagPending.setEmptyAttributeValue();
            }
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error(this);
                tokeniser.tagPending.appendAttributeValue((char) 65533);
                return;
            }
            if (consume == 65535) {
                tokeniser.eofError(this);
                tokeniserState = TokeniserState.Data;
            } else {
                if (consume == '&') {
                    char[] consumeCharacterReference = tokeniser.consumeCharacterReference('\'', true);
                    Token.Tag tag = tokeniser.tagPending;
                    if (consumeCharacterReference != null) {
                        tag.appendAttributeValue(consumeCharacterReference);
                        return;
                    } else {
                        tag.appendAttributeValue('&');
                        return;
                    }
                }
                if (consume != '\'') {
                    return;
                } else {
                    tokeniserState = TokeniserState.AfterAttributeValue_quoted;
                }
            }
            tokeniser.transition(tokeniserState);
        }
    },
    AttributeValue_unquoted { // from class: org.jsoup.parser.TokeniserState.40
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            Token.Tag tag;
            TokeniserState tokeniserState;
            String consumeToAny = characterReader.consumeToAny('\t', '\n', '\r', '\f', ' ', '&', '>', 0, '\"', '\'', '<', '=', '`');
            if (consumeToAny.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(consumeToAny);
            }
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != ' ') {
                    if (consume != '\"' && consume != '`') {
                        if (consume == 65535) {
                            tokeniser.eofError(this);
                        } else if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r') {
                            if (consume == '&') {
                                char[] consumeCharacterReference = tokeniser.consumeCharacterReference('>', true);
                                Token.Tag tag2 = tokeniser.tagPending;
                                if (consumeCharacterReference != null) {
                                    tag2.appendAttributeValue(consumeCharacterReference);
                                    return;
                                } else {
                                    tag2.appendAttributeValue('&');
                                    return;
                                }
                            }
                            if (consume != '\'') {
                                switch (consume) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        tokeniser.emitTagPending();
                                        break;
                                    default:
                                        return;
                                }
                            }
                        }
                        tokeniserState = TokeniserState.Data;
                        tokeniser.transition(tokeniserState);
                        return;
                    }
                    tokeniser.error(this);
                    tag = tokeniser.tagPending;
                }
                tokeniserState = TokeniserState.BeforeAttributeName;
                tokeniser.transition(tokeniserState);
                return;
            }
            tokeniser.error(this);
            tag = tokeniser.tagPending;
            consume = 65533;
            tag.appendAttributeValue(consume);
        }
    },
    AfterAttributeValue_quoted { // from class: org.jsoup.parser.TokeniserState.41
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r' && consume != ' ') {
                if (consume != '/') {
                    if (consume == '>') {
                        tokeniser.emitTagPending();
                    } else if (consume != 65535) {
                        tokeniser.error(this);
                        characterReader.unconsume();
                    } else {
                        tokeniser.eofError(this);
                    }
                    tokeniserState = TokeniserState.Data;
                } else {
                    tokeniserState = TokeniserState.SelfClosingStartTag;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniserState = TokeniserState.BeforeAttributeName;
            tokeniser.transition(tokeniserState);
        }
    },
    SelfClosingStartTag { // from class: org.jsoup.parser.TokeniserState.42
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume == '>') {
                tokeniser.tagPending.selfClosing = true;
                tokeniser.emitTagPending();
            } else {
                if (consume != 65535) {
                    tokeniser.error(this);
                    tokeniserState = TokeniserState.BeforeAttributeName;
                    tokeniser.transition(tokeniserState);
                }
                tokeniser.eofError(this);
            }
            tokeniserState = TokeniserState.Data;
            tokeniser.transition(tokeniserState);
        }
    },
    BogusComment { // from class: org.jsoup.parser.TokeniserState.43
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            characterReader.unconsume();
            Token.Comment comment = new Token.Comment();
            comment.bogus = true;
            comment.data.append(characterReader.consumeTo('>'));
            tokeniser.emit(comment);
            tokeniser.advanceTransition(TokeniserState.Data);
        }
    },
    MarkupDeclarationOpen { // from class: org.jsoup.parser.TokeniserState.44
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.matchConsume("--")) {
                tokeniser.createCommentPending();
                tokeniserState = TokeniserState.CommentStart;
            } else if (characterReader.matchConsumeIgnoreCase("DOCTYPE")) {
                tokeniserState = TokeniserState.Doctype;
            } else {
                if (!characterReader.matchConsume("[CDATA[")) {
                    tokeniser.error(this);
                    tokeniser.advanceTransition(TokeniserState.BogusComment);
                    return;
                }
                tokeniserState = TokeniserState.CdataSection;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    CommentStart { // from class: org.jsoup.parser.TokeniserState.45
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '-') {
                    if (consume == '>') {
                        tokeniser.error(this);
                    } else if (consume != 65535) {
                        tokeniser.commentPending.data.append(consume);
                    } else {
                        tokeniser.eofError(this);
                    }
                    tokeniser.emitCommentPending();
                    tokeniserState = TokeniserState.Data;
                } else {
                    tokeniserState = TokeniserState.CommentStartDash;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            tokeniser.commentPending.data.append((char) 65533);
            tokeniserState = TokeniserState.Comment;
            tokeniser.transition(tokeniserState);
        }
    },
    CommentStartDash { // from class: org.jsoup.parser.TokeniserState.46
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '-') {
                    if (consume == '>') {
                        tokeniser.error(this);
                    } else if (consume != 65535) {
                        tokeniser.commentPending.data.append(consume);
                    } else {
                        tokeniser.eofError(this);
                    }
                    tokeniser.emitCommentPending();
                    tokeniserState = TokeniserState.Data;
                } else {
                    tokeniserState = TokeniserState.CommentStartDash;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            tokeniser.commentPending.data.append((char) 65533);
            tokeniserState = TokeniserState.Comment;
            tokeniser.transition(tokeniserState);
        }
    },
    Comment { // from class: org.jsoup.parser.TokeniserState.47
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current == 0) {
                tokeniser.error(this);
                characterReader.advance();
                tokeniser.commentPending.data.append((char) 65533);
            } else if (current == '-') {
                tokeniser.advanceTransition(TokeniserState.CommentEndDash);
            } else {
                if (current != 65535) {
                    tokeniser.commentPending.data.append(characterReader.consumeToAny('-', 0));
                    return;
                }
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    CommentEndDash { // from class: org.jsoup.parser.TokeniserState.48
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume == '-') {
                    tokeniserState = TokeniserState.CommentEnd;
                } else if (consume != 65535) {
                    StringBuilder sb2 = tokeniser.commentPending.data;
                    sb2.append('-');
                    sb2.append(consume);
                } else {
                    tokeniser.eofError(this);
                    tokeniser.emitCommentPending();
                    tokeniserState = TokeniserState.Data;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            StringBuilder sb3 = tokeniser.commentPending.data;
            sb3.append('-');
            sb3.append((char) 65533);
            tokeniserState = TokeniserState.Comment;
            tokeniser.transition(tokeniserState);
        }
    },
    CommentEnd { // from class: org.jsoup.parser.TokeniserState.49
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume == '!') {
                    tokeniser.error(this);
                    tokeniserState = TokeniserState.CommentEndBang;
                } else {
                    if (consume == '-') {
                        tokeniser.error(this);
                        tokeniser.commentPending.data.append('-');
                        return;
                    }
                    if (consume != '>') {
                        if (consume != 65535) {
                            tokeniser.error(this);
                            StringBuilder sb2 = tokeniser.commentPending.data;
                            sb2.append("--");
                            sb2.append(consume);
                        } else {
                            tokeniser.eofError(this);
                        }
                    }
                    tokeniser.emitCommentPending();
                    tokeniserState = TokeniserState.Data;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            StringBuilder sb3 = tokeniser.commentPending.data;
            sb3.append("--");
            sb3.append((char) 65533);
            tokeniserState = TokeniserState.Comment;
            tokeniser.transition(tokeniserState);
        }
    },
    CommentEndBang { // from class: org.jsoup.parser.TokeniserState.50
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '-') {
                    if (consume != '>') {
                        if (consume != 65535) {
                            StringBuilder sb2 = tokeniser.commentPending.data;
                            sb2.append("--!");
                            sb2.append(consume);
                        } else {
                            tokeniser.eofError(this);
                        }
                    }
                    tokeniser.emitCommentPending();
                    tokeniserState = TokeniserState.Data;
                } else {
                    tokeniser.commentPending.data.append("--!");
                    tokeniserState = TokeniserState.CommentEndDash;
                }
                tokeniser.transition(tokeniserState);
            }
            tokeniser.error(this);
            StringBuilder sb3 = tokeniser.commentPending.data;
            sb3.append("--!");
            sb3.append((char) 65533);
            tokeniserState = TokeniserState.Comment;
            tokeniser.transition(tokeniserState);
        }
    },
    Doctype { // from class: org.jsoup.parser.TokeniserState.51
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r' && consume != ' ') {
                if (consume != '>') {
                    if (consume != 65535) {
                        tokeniser.error(this);
                    } else {
                        tokeniser.eofError(this);
                    }
                }
                tokeniser.error(this);
                tokeniser.createDoctypePending();
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
                tokeniser.transition(tokeniserState);
            }
            tokeniserState = TokeniserState.BeforeDoctypeName;
            tokeniser.transition(tokeniserState);
        }
    },
    BeforeDoctypeName { // from class: org.jsoup.parser.TokeniserState.52
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            if (characterReader.matchesLetter()) {
                tokeniser.createDoctypePending();
                tokeniser.transition(TokeniserState.DoctypeName);
                return;
            }
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error(this);
                tokeniser.createDoctypePending();
                tokeniser.doctypePending.name.append((char) 65533);
            } else {
                if (consume == ' ') {
                    return;
                }
                if (consume == 65535) {
                    tokeniser.eofError(this);
                    tokeniser.createDoctypePending();
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniserState = TokeniserState.Data;
                    tokeniser.transition(tokeniserState);
                }
                if (consume == '\t' || consume == '\n' || consume == '\f' || consume == '\r') {
                    return;
                }
                tokeniser.createDoctypePending();
                tokeniser.doctypePending.name.append(consume);
            }
            tokeniserState = TokeniserState.DoctypeName;
            tokeniser.transition(tokeniserState);
        }
    },
    DoctypeName { // from class: org.jsoup.parser.TokeniserState.53
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            StringBuilder sb2;
            TokeniserState tokeniserState;
            if (characterReader.matchesLetter()) {
                tokeniser.doctypePending.name.append(characterReader.consumeLetterSequence().toLowerCase());
                return;
            }
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != ' ') {
                    if (consume != '>') {
                        if (consume == 65535) {
                            tokeniser.eofError(this);
                            tokeniser.doctypePending.forceQuirks = true;
                        } else if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r') {
                            sb2 = tokeniser.doctypePending.name;
                        }
                    }
                    tokeniser.emitDoctypePending();
                    tokeniserState = TokeniserState.Data;
                    tokeniser.transition(tokeniserState);
                    return;
                }
                tokeniserState = TokeniserState.AfterDoctypeName;
                tokeniser.transition(tokeniserState);
                return;
            }
            tokeniser.error(this);
            sb2 = tokeniser.doctypePending.name;
            consume = 65533;
            sb2.append(consume);
        }
    },
    AfterDoctypeName { // from class: org.jsoup.parser.TokeniserState.54
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            TokeniserState tokeniserState2;
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            if (characterReader.matchesAny('\t', '\n', '\r', '\f', ' ')) {
                characterReader.advance();
                return;
            }
            if (!characterReader.matches('>')) {
                if (characterReader.matchConsumeIgnoreCase("PUBLIC")) {
                    tokeniserState2 = TokeniserState.AfterDoctypePublicKeyword;
                } else if (characterReader.matchConsumeIgnoreCase("SYSTEM")) {
                    tokeniserState2 = TokeniserState.AfterDoctypeSystemKeyword;
                } else {
                    tokeniser.error(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniserState = TokeniserState.BogusDoctype;
                }
                tokeniser.transition(tokeniserState2);
                return;
            }
            tokeniser.emitDoctypePending();
            tokeniserState = TokeniserState.Data;
            tokeniser.advanceTransition(tokeniserState);
        }
    },
    AfterDoctypePublicKeyword { // from class: org.jsoup.parser.TokeniserState.55
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume == '\t' || consume == '\n' || consume == '\f' || consume == '\r' || consume == ' ') {
                tokeniserState = TokeniserState.BeforeDoctypePublicIdentifier;
            } else if (consume == '\"') {
                tokeniser.error(this);
                tokeniserState = TokeniserState.DoctypePublicIdentifier_doubleQuoted;
            } else if (consume != '\'') {
                if (consume == '>') {
                    tokeniser.error(this);
                } else if (consume != 65535) {
                    tokeniser.error(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniserState = TokeniserState.BogusDoctype;
                } else {
                    tokeniser.eofError(this);
                }
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
            } else {
                tokeniser.error(this);
                tokeniserState = TokeniserState.DoctypePublicIdentifier_singleQuoted;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    BeforeDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.56
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume == '\t' || consume == '\n' || consume == '\f' || consume == '\r' || consume == ' ') {
                return;
            }
            if (consume == '\"') {
                tokeniserState = TokeniserState.DoctypePublicIdentifier_doubleQuoted;
            } else if (consume != '\'') {
                if (consume == '>') {
                    tokeniser.error(this);
                } else if (consume != 65535) {
                    tokeniser.error(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniserState = TokeniserState.BogusDoctype;
                } else {
                    tokeniser.eofError(this);
                }
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
            } else {
                tokeniserState = TokeniserState.DoctypePublicIdentifier_singleQuoted;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    DoctypePublicIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.57
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            StringBuilder sb2;
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '\"') {
                    if (consume == '>') {
                        tokeniser.error(this);
                    } else if (consume != 65535) {
                        sb2 = tokeniser.doctypePending.publicIdentifier;
                    } else {
                        tokeniser.eofError(this);
                    }
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniserState = TokeniserState.Data;
                } else {
                    tokeniserState = TokeniserState.AfterDoctypePublicIdentifier;
                }
                tokeniser.transition(tokeniserState);
                return;
            }
            tokeniser.error(this);
            sb2 = tokeniser.doctypePending.publicIdentifier;
            consume = 65533;
            sb2.append(consume);
        }
    },
    DoctypePublicIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.58
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            StringBuilder sb2;
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '\'') {
                    if (consume == '>') {
                        tokeniser.error(this);
                    } else if (consume != 65535) {
                        sb2 = tokeniser.doctypePending.publicIdentifier;
                    } else {
                        tokeniser.eofError(this);
                    }
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniserState = TokeniserState.Data;
                } else {
                    tokeniserState = TokeniserState.AfterDoctypePublicIdentifier;
                }
                tokeniser.transition(tokeniserState);
                return;
            }
            tokeniser.error(this);
            sb2 = tokeniser.doctypePending.publicIdentifier;
            consume = 65533;
            sb2.append(consume);
        }
    },
    AfterDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.59
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume == '\t' || consume == '\n' || consume == '\f' || consume == '\r' || consume == ' ') {
                tokeniserState = TokeniserState.BetweenDoctypePublicAndSystemIdentifiers;
            } else if (consume == '\"') {
                tokeniser.error(this);
                tokeniserState = TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
            } else if (consume != '\'') {
                if (consume != '>') {
                    if (consume != 65535) {
                        tokeniser.error(this);
                        tokeniser.doctypePending.forceQuirks = true;
                        tokeniserState = TokeniserState.BogusDoctype;
                    } else {
                        tokeniser.eofError(this);
                        tokeniser.doctypePending.forceQuirks = true;
                    }
                }
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
            } else {
                tokeniser.error(this);
                tokeniserState = TokeniserState.DoctypeSystemIdentifier_singleQuoted;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers { // from class: org.jsoup.parser.TokeniserState.60
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume == '\t' || consume == '\n' || consume == '\f' || consume == '\r' || consume == ' ') {
                return;
            }
            if (consume == '\"') {
                tokeniser.error(this);
                tokeniserState = TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
            } else if (consume != '\'') {
                if (consume != '>') {
                    if (consume != 65535) {
                        tokeniser.error(this);
                        tokeniser.doctypePending.forceQuirks = true;
                        tokeniserState = TokeniserState.BogusDoctype;
                    } else {
                        tokeniser.eofError(this);
                        tokeniser.doctypePending.forceQuirks = true;
                    }
                }
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
            } else {
                tokeniser.error(this);
                tokeniserState = TokeniserState.DoctypeSystemIdentifier_singleQuoted;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    AfterDoctypeSystemKeyword { // from class: org.jsoup.parser.TokeniserState.61
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume == '\t' || consume == '\n' || consume == '\f' || consume == '\r' || consume == ' ') {
                tokeniserState = TokeniserState.BeforeDoctypeSystemIdentifier;
            } else if (consume == '\"') {
                tokeniser.error(this);
                tokeniserState = TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
            } else if (consume != '\'') {
                if (consume == '>') {
                    tokeniser.error(this);
                } else {
                    if (consume != 65535) {
                        tokeniser.error(this);
                        tokeniser.doctypePending.forceQuirks = true;
                        tokeniser.emitDoctypePending();
                        return;
                    }
                    tokeniser.eofError(this);
                }
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
            } else {
                tokeniser.error(this);
                tokeniserState = TokeniserState.DoctypeSystemIdentifier_singleQuoted;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    BeforeDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.62
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume == '\t' || consume == '\n' || consume == '\f' || consume == '\r' || consume == ' ') {
                return;
            }
            if (consume == '\"') {
                tokeniserState = TokeniserState.DoctypeSystemIdentifier_doubleQuoted;
            } else if (consume != '\'') {
                if (consume == '>') {
                    tokeniser.error(this);
                } else if (consume != 65535) {
                    tokeniser.error(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniserState = TokeniserState.BogusDoctype;
                } else {
                    tokeniser.eofError(this);
                }
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniserState = TokeniserState.Data;
            } else {
                tokeniserState = TokeniserState.DoctypeSystemIdentifier_singleQuoted;
            }
            tokeniser.transition(tokeniserState);
        }
    },
    DoctypeSystemIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.63
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            StringBuilder sb2;
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '\"') {
                    if (consume == '>') {
                        tokeniser.error(this);
                    } else if (consume != 65535) {
                        sb2 = tokeniser.doctypePending.systemIdentifier;
                    } else {
                        tokeniser.eofError(this);
                    }
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniserState = TokeniserState.Data;
                } else {
                    tokeniserState = TokeniserState.AfterDoctypeSystemIdentifier;
                }
                tokeniser.transition(tokeniserState);
                return;
            }
            tokeniser.error(this);
            sb2 = tokeniser.doctypePending.systemIdentifier;
            consume = 65533;
            sb2.append(consume);
        }
    },
    DoctypeSystemIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.64
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            StringBuilder sb2;
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != '\'') {
                    if (consume == '>') {
                        tokeniser.error(this);
                    } else if (consume != 65535) {
                        sb2 = tokeniser.doctypePending.systemIdentifier;
                    } else {
                        tokeniser.eofError(this);
                    }
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniserState = TokeniserState.Data;
                } else {
                    tokeniserState = TokeniserState.AfterDoctypeSystemIdentifier;
                }
                tokeniser.transition(tokeniserState);
                return;
            }
            tokeniser.error(this);
            sb2 = tokeniser.doctypePending.systemIdentifier;
            consume = 65533;
            sb2.append(consume);
        }
    },
    AfterDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.65
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState;
            char consume = characterReader.consume();
            if (consume == '\t' || consume == '\n' || consume == '\f' || consume == '\r' || consume == ' ') {
                return;
            }
            if (consume != '>') {
                if (consume != 65535) {
                    tokeniser.error(this);
                    tokeniserState = TokeniserState.BogusDoctype;
                    tokeniser.transition(tokeniserState);
                }
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
            }
            tokeniser.emitDoctypePending();
            tokeniserState = TokeniserState.Data;
            tokeniser.transition(tokeniserState);
        }
    },
    BogusDoctype { // from class: org.jsoup.parser.TokeniserState.66
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == '>' || consume == 65535) {
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    CdataSection { // from class: org.jsoup.parser.TokeniserState.67
        @Override // org.jsoup.parser.TokeniserState
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.emit(characterReader.consumeTo("]]>"));
            characterReader.matchConsume("]]>");
            tokeniser.transition(TokeniserState.Data);
        }
    };

    private static final char[] attributeDoubleValueCharsSorted;
    private static final char[] attributeNameCharsSorted;
    private static final char[] attributeSingleValueCharsSorted;
    private static final char eof = 65535;
    public static final char nullChar = 0;
    private static final char replacementChar = 65533;
    private static final String replacementStr = String.valueOf((char) 65533);

    static {
        char[] cArr = {'\'', '&', 0};
        attributeSingleValueCharsSorted = cArr;
        char[] cArr2 = {'\"', '&', 0};
        attributeDoubleValueCharsSorted = cArr2;
        char[] cArr3 = {'\t', '\n', '\r', '\f', ' ', '/', '=', '>', 0, '\"', '\'', '<'};
        attributeNameCharsSorted = cArr3;
        Arrays.sort(cArr);
        Arrays.sort(cArr2);
        Arrays.sort(cArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleDataDoubleEscapeTag(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (characterReader.matchesLetter()) {
            String consumeLetterSequence = characterReader.consumeLetterSequence();
            tokeniser.dataBuffer.append(consumeLetterSequence.toLowerCase());
            tokeniser.emit(consumeLetterSequence);
            return;
        }
        char consume = characterReader.consume();
        if (consume != '\t' && consume != '\n' && consume != '\f' && consume != '\r' && consume != ' ' && consume != '/' && consume != '>') {
            characterReader.unconsume();
            tokeniser.transition(tokeniserState2);
        } else {
            if (tokeniser.dataBuffer.toString().equals("script")) {
                tokeniser.transition(tokeniserState);
            } else {
                tokeniser.transition(tokeniserState2);
            }
            tokeniser.emit(consume);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleDataEndTag(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState) {
        TokeniserState tokeniserState2;
        if (characterReader.matchesLetter()) {
            String consumeLetterSequence = characterReader.consumeLetterSequence();
            tokeniser.tagPending.appendTagName(consumeLetterSequence.toLowerCase());
            tokeniser.dataBuffer.append(consumeLetterSequence);
            return;
        }
        boolean z10 = true;
        if (tokeniser.isAppropriateEndTagToken()) {
            z10 = true;
            if (!characterReader.isEmpty()) {
                char consume = characterReader.consume();
                if (consume == '\t' || consume == '\n' || consume == '\f' || consume == '\r' || consume == ' ') {
                    tokeniserState2 = BeforeAttributeName;
                } else if (consume == '/') {
                    tokeniserState2 = SelfClosingStartTag;
                } else if (consume != '>') {
                    tokeniser.dataBuffer.append(consume);
                    z10 = true;
                } else {
                    tokeniser.emitTagPending();
                    tokeniserState2 = Data;
                }
                tokeniser.transition(tokeniserState2);
                z10 = false;
            }
        }
        if (z10) {
            tokeniser.emit("</" + tokeniser.dataBuffer.toString());
            tokeniser.transition(tokeniserState);
        }
    }

    public abstract void read(Tokeniser tokeniser, CharacterReader characterReader);
}
