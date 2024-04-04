// vars/greetingMessage.groovy

import java.util.Properties

def call() {
    def configProperties = new Properties()
    def classLoader = this.class.classLoader
    def configStream = classLoader.getResourceAsStream("config.properties")

    configProperties.load(configStream)
    def channel=configProperties.getProperty('SLACK_CHANNEL_NAME')
}