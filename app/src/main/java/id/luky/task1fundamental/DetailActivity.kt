package id.luky.task1fundamental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import id.luky.task1fundamental.databinding.ActivityDetailBinding
import id.luky.task1fundamental.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Detail User"

        val user = intent.getParcelableExtra<User>(EXTRA_USER) as User

        binding.apply {
            photo.setImageResource(user.photo)
            tvUser.text = user.name
            tvUsername.text = user.username
        }

//        binding.photo.setImageResource(user.photo)
//        binding.tvUser.text = user.name
//        binding.tvUsername.text = user.username
    }
}