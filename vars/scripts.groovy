// vars/greetingMessage.groovy

import java.util.Properties

def call() {
    def configProperties = new Properties()
    def classLoader = this.class.classLoader
    def configStream = classLoader.getResourceAsStream("config.properties")


    configProperties.load(configStream)
    def channel = configProperties.getProperty('SLACK_CHANNEL_NAME')
    def env = configProperties.getProperty('ENVIRONMENT')
    def cbp = configProperties.getProperty('CODE_BASE_PATH')
    def am = configProperties.getProperty('ACTION_MESSAGE')
    def kas = configProperties.getProperty('KEEP_APPROVAL_STAGE')
}

def approval(){
    input 'Do you want to continue?'
}
