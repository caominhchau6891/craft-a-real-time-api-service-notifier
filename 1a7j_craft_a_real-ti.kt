package com.craft.realtime.notifier

data class ApiNotification(
    val id: Int,
    val apiName: String,
    val notificationType: NotificationType,
    val message: String,
    val timestamp: Long
)

enum class NotificationType {
    INFO,
    WARNING,
    ERROR
}

data class ApiService(
    val id: Int,
    val name: String,
    val url: String,
    val notifications: List<ApiNotification> = emptyList()
)

class RealtimeNotifier {
    private val apiServices: MutableList<ApiService> = mutableListOf()

    fun addApiService(apiService: ApiService) {
        apiServices.add(apiService)
    }

    fun notify(notification: ApiNotification) {
        // TO DO: implement logic to send notification to subscribers
        println("Notifying subscribers: $notification")
    }
}