module chicory.aot {
    requires chicory.runtime;
    requires chicory.wasm;
    requires org.objectweb.asm.commons;
    requires org.objectweb.asm.util;

    exports com.dylibso.chicory.experimental.aot;
}
