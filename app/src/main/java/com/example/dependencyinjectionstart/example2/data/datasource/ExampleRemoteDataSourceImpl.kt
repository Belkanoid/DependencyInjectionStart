package com.example.dependencyinjectionstart.example2.data.datasource

import com.example.dependencyinjectionstart.example2.data.newtwork.ExampleApiService

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {

    }
}
