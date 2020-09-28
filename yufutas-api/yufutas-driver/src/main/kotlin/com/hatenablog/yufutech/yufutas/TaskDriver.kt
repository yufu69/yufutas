package com.hatenablog.yufutech.yufutas

import org.springframework.data.jpa.repository.JpaRepository
import javax.inject.Named

@Named
interface TaskDriver: JpaRepository<Task, Integer> {
    fun save(task: Task)
}
