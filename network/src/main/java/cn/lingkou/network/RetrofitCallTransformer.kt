package cn.lingkou.network

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

inline fun <T> Call<T>.toRequest(crossinline apiResponse: (ApiResponse<T>) -> Unit) {
    apiResponse(ApiResponse.loading())
    enqueue(object : Callback<T> {
        override fun onFailure(call: Call<T>, t: Throwable) {
            apiResponse(ApiResponse.error(t.message.toString()))
        }

        override fun onResponse(call: Call<T>, response: Response<T>) {
            if (response.isSuccessful) {
                apiResponse(ApiResponse.success(response))
            } else {
                apiResponse(ApiResponse.error(response.errorBody().toString()))
            }
        }
    })
}