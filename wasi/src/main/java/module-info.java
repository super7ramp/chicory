module chicory.wasi {
    requires static chicory.hostmodule.annotations;
    requires chicory.log;
    requires chicory.runtime;
    requires chicory.wasm;
    requires static java.compiler;

    uses javax.annotation.processing.Processor;

    exports com.dylibso.chicory.wasi;
}
