module chicory.hostmodule.processor {
    requires chicory.hostmodule.annotations;
    requires chicory.wasm;
    requires com.github.javaparser.core;
    requires java.compiler;

    provides javax.annotation.processing.Processor with
            com.dylibso.chicory.experimental.hostmodule.processor.HostModuleProcessor,
            com.dylibso.chicory.experimental.hostmodule.processor.WasmModuleProcessor;

    exports com.dylibso.chicory.experimental.hostmodule.processor;
}
