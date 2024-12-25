package tv.danmaku.ijk.media.player.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: combined.jar:classes3.jar:tv/danmaku/ijk/media/player/annotations/CalledByNative.class */
public @interface CalledByNative {
    String value() default "";
}
