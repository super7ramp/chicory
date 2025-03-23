module chicory.cli {
    requires chicory.runtime;
    requires chicory.wasi;
    requires chicory.wasm;
    requires info.picocli;
    requires java.logging;

    opens com.dylibso.chicory.experimental.cli to
            info.picocli;
}
