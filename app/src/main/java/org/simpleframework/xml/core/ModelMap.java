package org.simpleframework.xml.core;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/ModelMap.class */
class ModelMap extends LinkedHashMap<String, ModelList> implements Iterable<ModelList> {
    private final Detail detail;

    public ModelMap(Detail detail) {
        this.detail = detail;
    }

    public ModelMap getModels() {
        ModelMap modelMap = new ModelMap(this.detail);
        for (String str : keySet()) {
            ModelList modelList = get(str);
            ModelList modelList2 = modelList;
            if (modelList != null) {
                modelList2 = modelList.build();
            }
            if (modelMap.containsKey(str)) {
                throw new PathException("Path with name '%s' is a duplicate in %s ", str, this.detail);
            }
            modelMap.put(str, modelList2);
        }
        return modelMap;
    }

    @Override // java.lang.Iterable
    public Iterator<ModelList> iterator() {
        return values().iterator();
    }

    public Model lookup(String str, int i10) {
        ModelList modelList = get(str);
        if (modelList != null) {
            return modelList.lookup(i10);
        }
        return null;
    }

    public void register(String str, Model model) {
        ModelList modelList = get(str);
        ModelList modelList2 = modelList;
        if (modelList == null) {
            modelList2 = new ModelList();
            put(str, modelList2);
        }
        modelList2.register(model);
    }
}
