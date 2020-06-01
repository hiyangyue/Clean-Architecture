package cn.lingkou.network

import retrofit2.Response

sealed class ApiResponse<T> {
    class Loading<T> : ApiResponse<T>()

    data class Success<T>(val response: Response<T>) : ApiResponse<T>() {
        val statusCode = response.code()
        val header = response.headers()
        val rawData = response.raw()
        val data: T? = response.body()
    }

    data class Error<T>(val message: String) : ApiResponse<T>()

    companion object {
        fun <T> loading() = Loading<T>()

        fun <T> success(response: Response<T>) = Success<T>(response)

        fun <T> error(message: String) = Error<T>(message)
    }
}

fun <T> ApiResponse<T>.onSuccess(onResult: (ApiResponse<T>) -> Unit): ApiResponse<T> {
    if (this is ApiResponse.Success) onResult(this)
    return this
}

fun <T> ApiResponse<T>.onError(onResult: (ApiResponse<T>) -> Unit): ApiResponse<T> {
    if (this is ApiResponse.Error) onResult(this)
    return this
}

fun <T> ApiResponse<T>.onLoading(onResult: (ApiResponse<T>) -> Unit): ApiResponse<T> {
    if (this is ApiResponse.Loading) onResult(this)
    return this
}