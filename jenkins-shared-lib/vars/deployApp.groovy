def call(String app = "App1") {
    if (app == "App1") {
        echo "Deployed -App1 into prod."
    } else if (app == "App2") {
        echo "Deployed -App2 into prod."
    }
}