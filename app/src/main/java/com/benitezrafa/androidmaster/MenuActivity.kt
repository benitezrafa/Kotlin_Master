package com.benitezrafa.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.benitezrafa.androidmaster.firstapp.FirstAppActivity
import com.benitezrafa.androidmaster.firstapp.ResultActivity
import com.benitezrafa.androidmaster.imccalculator.ImcCalculatorActivity
import com.benitezrafa.androidmaster.superheroapp.SuperHeroListActivity
import com.benitezrafa.androidmaster.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnImcApp = findViewById<Button>(R.id.btnImcApp)
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        val btnHeroApp = findViewById<Button>(R.id.btnHeroApp)

        btnSaludApp.setOnClickListener { navigateToSaludApp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnTODO.setOnClickListener { navigateToTodoApp() }
        btnHeroApp.setOnClickListener { navigateToHeroApp() }
    }

    private fun navigateToHeroApp() {
        val intent = Intent (this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTodoApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }


}