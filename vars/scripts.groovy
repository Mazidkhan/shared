// vars/greetingMessage.groovy

import java.util.Properties

def call() {
    def configProperties = new Properties()
    def classLoader = this.class.classLoader
    def configStream = classLoader.getResourceAsStream("config.properties")

    if (configStream != null) {
        configProperties.load(configStream)
        def channel=configProperties.getProperty('SLACK_CHANNEL_NAME')
    } else {
        return "Hello from shared library! (config.properties not found)"
    }
}
