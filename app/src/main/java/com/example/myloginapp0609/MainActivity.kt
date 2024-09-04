package com.example.myloginapp0609

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {

    // Declare views with proper variable naming conventions
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enable edge-to-edge display for a more immersive experience
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        // Bind views to corresponding IDs using view binding or findViewById
        usernameEditText = findViewById(R.id.username_input)
        passwordEditText = findViewById(R.id.password_input)
        loginButton = findViewById(R.id.login_btn)

        // Handle login button click
        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Implement your login logic here (validation, network request, etc.)
            Log.i("LoginCredentials", "Username: $username, Password: $password") // Corrected tag and placeholders
        }

        // Optional: Handle system bar insets (consider using WindowCompat.setOnApplyWindowInsetsListener)
        ViewCompat.setOnApplyWindowInsetsListener(window.decorView) { v, windowInsets ->
            val insets = windowInsets.systemWindowInsets
            // Adjust your view layout or paddings based on insets if needed
            return@setOnApplyWindowInsetsListener windowInsets
        }
    }
}