import groovy.yaml.Yaml

def call(Map config = [:]) {
    def yamlContent = readFile(config.yamlFile)
    def yamlData = new Yaml().load(yamlContent)
    
    def name = yamlData.firstname.trim()
    def lname = yamlData.lname.trim()
    
    sh "echo ${name} ${lname}"
}
