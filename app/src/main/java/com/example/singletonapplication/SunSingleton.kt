package com.example.singletonapplication

class SunSingleton private constructor(var name: String) {
    companion object {
        @Volatile
        private var instance: SunSingleton? = null
        fun getInstance(value: String) =
            instance ?: synchronized(this) {
                instance ?: SunSingleton(value).also { instance = it}
            }
    }
}