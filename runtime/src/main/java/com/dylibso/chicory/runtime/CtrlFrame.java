package com.dylibso.chicory.runtime;

import com.dylibso.chicory.wasm.types.OpCode;

final class CtrlFrame {

    private static final CtrlFrame[] POOL = new CtrlFrame[20];

    // OpCode of the current Control Flow instruction
    public final OpCode opCode;
    // params or inputs
    public final int startValues;
    // returns or outputs
    public final int endValues;
    // the height of the stack before entering the current Control Flow instruction
    public final int height;

    // the program counter of a TRY_TABLE block
    // TODO: do we have a better way of doing this?
    public final int pc;

    public static CtrlFrame of(OpCode opCode, int startValues, int endValues, int height) {
        return of(opCode, startValues, endValues, height, 0);
    }

    public static CtrlFrame of(OpCode opCode, int startValues, int endValues, int height, int pc) {
        for (int i = 0; i < POOL.length; i++) {
            final CtrlFrame frame = POOL[i];
            if (frame == null) {
                POOL[i] = new CtrlFrame(opCode, startValues, endValues, height, pc);
                return POOL[i];
            }
            if (frame.opCode == opCode
                    && frame.startValues == startValues
                    && frame.endValues == endValues
                    && frame.height == height
                    && frame.pc == pc) {
                return frame;
            }
        }
        POOL[POOL.length - 1] = new CtrlFrame(opCode, startValues, endValues, height, pc);
        return POOL[POOL.length - 1];
    }

    private CtrlFrame(OpCode opCode, int startValues, int endValues, int height, int pc) {
        this.opCode = opCode;
        this.startValues = startValues;
        this.endValues = endValues;
        this.height = height;
        this.pc = pc;
    }

    @Override
    public String toString() {
        return "CtrlFrame{"
                + "opCode="
                + opCode
                + ", startValues="
                + startValues
                + ", endValues="
                + endValues
                + ", height="
                + height
                + ", pc="
                + pc
                + '}';
    }
}
