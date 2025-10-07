package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BusScheduleDao {
    @Query("SELECT * from Schedule WHERE stop_name = :stopname")
    fun getBusStop(stopname: String): Flow<List<BusSchedule>>

    @Query("SELECT * from Schedule ORDER BY arrival_time ASC")
    fun getAllBusStops(): Flow<List<BusSchedule>>
}