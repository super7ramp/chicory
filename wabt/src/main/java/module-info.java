module chicory.wabt {
    requires chicory.log;
    requires chicory.runtime;
    requires chicory.wasi;
    requires chicory.wasm;
    requires com.google.common.jimfs;

    exports com.dylibso.chicory.wabt;
}
