package com.dylibso.chicory.wasm.corpus;

import java.io.InputStream;

/**
 * A bundle of wasm files for testing purposes.
 */
public final class WasmCorpus {

    /** Private constructor to prevent instantiation. */
    private WasmCorpus() {
        // nothing to do
    }

    /**
     * Gets the compiled wasm with given name as a stream.
     *
     * @return the wasm as a stream, or {@code null} if not found
     */
    public static InputStream getCompiledAsStream(final String name) {
        return WasmCorpus.class.getResourceAsStream("/compiled/" + name);
    }
}
