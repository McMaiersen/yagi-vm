package de.fhac.ti.yagi.vm.memory.models;

import de.fhac.ti.yagi.vm.memory.MemoryManagement;

public class Fluent extends AbstractGlobalModel {

    public Fluent(String name, MemoryManagement.TermType termType) {
        super(name, termType);
    }

    public Fluent(String name, MemoryManagement.TermType termType, SetType setType) {
        super(name, termType, setType);
    }

}
