def getConfig() {
    def config = [:]
    def configFile = new File('nginx_config.yml')
    def configData = configFile.text
    configData.split('\n').each { line ->
        def parts = line.trim().split(':')
        config[parts[0].trim()] = parts[1].trim()
    }
    return config
}

def cloneRepository() {
    def config = getConfig()
    def slackChannel = config['SLACK_CHANNEL_NAME']
    // Implement clone logic using config values
}

def userApproval() {
    def config = getConfig()
    def environment = config['ENVIRONMENT']
    // Implement user approval logic using config values
}

def playbookExecution() {
    def config = getConfig()
    def codeBasePath = config['CODE_BASE_PATH']
    // Implement playbook execution logic using config values
}

def notification() {
    def config = getConfig()
    def actionMessage = config['ACTION_MESSAGE']
    // Implement notification logic using config values
}
