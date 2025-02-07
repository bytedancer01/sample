package org.simpleframework.xml.core;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/ModelList.class */
class ModelList extends ArrayList<Model> {
    public ModelList build() {
        ModelList modelList = new ModelList();
        Iterator<Model> it = iterator();
        while (it.hasNext()) {
            modelList.register(it.next());
        }
        return modelList;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        Iterator<Model> it = iterator();
        while (it.hasNext()) {
            Model next = it.next();
            if (next != null && !next.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public Model lookup(int i10) {
        if (i10 <= size()) {
            return get(i10 - 1);
        }
        return null;
    }

    public void register(Model model) {
        int index = model.getIndex();
        int size = size();
        for (int i10 = 0; i10 < index; i10++) {
            if (i10 >= size) {
                add(null);
            }
            int i11 = index - 1;
            if (i10 == i11) {
                set(i11, model);
            }
        }
    }

    public Model take() {
        while (!isEmpty()) {
            Model remove = remove(0);
            if (!remove.isEmpty()) {
                return remove;
            }
        }
        return null;
    }
}
