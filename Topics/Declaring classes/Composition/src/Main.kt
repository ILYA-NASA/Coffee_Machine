class OperatingSystem {
    lateinit var name: String
}

class DualBoot {
    var primaryOs = OperatingSystem()
    var secondaryOs = OperatingSystem()
}