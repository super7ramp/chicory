package com.dylibso.chicory.wasm.types;

@FunctionalInterface
public interface Operands {
    long operand(int index);

    default long get(int index) {
        return operand(index);
    }
}
