package com.example.mindork.data.database.repository.questions

import io.reactivex.Observable
import javax.inject.Inject

class QuestionRepositoty (private val questionsDao: QuestionsDao
) :QuestionRepo {
    override fun isQuestionRepositotyEmpty(): Observable<Boolean> =
        Observable.fromCallable {
            questionsDao.loadAll().isEmpty()
        }


    override fun insertQuestions(questions: List<Question>): Observable<Boolean> {
        questionsDao.insertAll(questions)
        return Observable.just(true)
    }

    override fun loadQuestions(): Observable<List<Question>> =
        Observable.fromCallable{
            questionsDao.loadAll()
        }
}