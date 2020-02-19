package com.jdktomcat.pack.pattern.builder;

import java.util.logging.Logger;

public class ComputerConcreteBuilder implements ComputerBuilder {

    Computer computer;

    @Override
    public void buildCpu() {

    }

    @Override
    public void buildMemory() {

    }

    @Override
    public void buildDisk() {

    }

    @Override
    public Computer buildComputer() {
        return null;
    }
}
