package org.simpleframework.xml.core;

import org.simpleframework.xml.Version;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Structure.class */
class Structure {
    private final Instantiator factory;
    private final Model model;
    private final boolean primitive;
    private final Label text;
    private final Label version;

    public Structure(Instantiator instantiator, Model model, Label label, Label label2, boolean z10) {
        this.primitive = z10;
        this.factory = instantiator;
        this.version = label;
        this.model = model;
        this.text = label2;
    }

    public Instantiator getInstantiator() {
        return this.factory;
    }

    public Version getRevision() {
        Label label = this.version;
        if (label != null) {
            return (Version) label.getContact().getAnnotation(Version.class);
        }
        return null;
    }

    public Section getSection() {
        return new ModelSection(this.model);
    }

    public Label getText() {
        return this.text;
    }

    public Label getVersion() {
        return this.version;
    }

    public boolean isPrimitive() {
        return this.primitive;
    }
}
