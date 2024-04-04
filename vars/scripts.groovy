// vars/greetingMessage.groovy

import java.util.Properties

def call() {
    def configProperties = new Properties()
    def classLoader = this.class.classLoader
    def configStream = classLoader.getResourceAsStream("config.properties")

    if (configStream != null) {
        configProperties.load(configStream)
        return "Hello from shared library! Config key value: ${configProperties.getProperty('key')}"
    } else {
        return "Hello from shared library! (config.properties not found)"
    }
}
