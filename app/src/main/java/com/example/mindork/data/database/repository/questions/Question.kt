package com.example.mindork.data.database.repository.questions

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


@Entity(tableName = "questions")
data class Question(
    @Expose
    @PrimaryKey
    var id: Long,

    @Expose
    @SerializedName("question_text")
    @ColumnInfo(name= "question_text")
    var questionText: String,

    @Expose
    @SerializedName("img_url")
    @ColumnInfo(name= "img_url")
    var imgUrl: String?,

    @Expose
    @SerializedName("created_at")
    @ColumnInfo(name= "created_at")
    var createdAt: String?,

    @Expose
    @SerializedName("updated_at")
    @ColumnInfo(name= "updated_at")
    var updatedAt: String?
)