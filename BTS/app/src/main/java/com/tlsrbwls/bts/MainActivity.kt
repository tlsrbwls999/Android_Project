package com.tlsrbwls.bts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //1.화면이 클릭되었다는 것을 알아야 합니다

        val image1=findViewById<ImageView>(R.id.bts_image_1) //이미지를 가져와서 변수에 넣어라
        image1.setOnClickListener{
            Toast.makeText(this,"1번 클릭완료",Toast.LENGTH_LONG).show()

            //2.그 다음에 화면이 클릭되면 , 다음 화면으로 넘어가서 사진을 크게 보여줌
            val intent =Intent(this,Bts1MainActivity::class.java)
            startActivity(intent)
        }

        val image2=findViewById<ImageView>(R.id.bts_image_2)
        image2.setOnClickListener{
            Toast.makeText(this,"2번 클릭완료",Toast.LENGTH_LONG).show()
            val intent =Intent(this,Bts2MainActivity::class.java)
            startActivity(intent)
        }

        val image3=findViewById<ImageView>(R.id.bts_image_3)
        image3.setOnClickListener{
            Toast.makeText(this,"3번 클릭완료",Toast.LENGTH_LONG).show()
            val intent =Intent(this,Bts3MainActivity::class.java)
            startActivity(intent)
        }

        val image4=findViewById<ImageView>(R.id.bts_image_4)
        image4.setOnClickListener{
            Toast.makeText(this,"4번 클릭완료",Toast.LENGTH_LONG).show()
            val intent =Intent(this,Bts4MainActivity::class.java)
            startActivity(intent)
        }

        val image5=findViewById<ImageView>(R.id.bts_image_5)
        image5.setOnClickListener{
            Toast.makeText(this,"5번 클릭완료",Toast.LENGTH_LONG).show()
            val intent =Intent(this,Bts5MainActivity2::class.java)
            startActivity(intent)
        }

        val image6=findViewById<ImageView>(R.id.bts_image_6)
        image6.setOnClickListener{
            Toast.makeText(this,"6번 클릭완료",Toast.LENGTH_LONG).show()
            val intent =Intent(this,Bts6MainActivity2::class.java)
            startActivity(intent)
        }

        val image7=findViewById<ImageView>(R.id.bts_image_7)
        image7.setOnClickListener{
            Toast.makeText(this,"7번 클릭완료",Toast.LENGTH_LONG).show()
            val intent =Intent(this,Bts7MainActivity2::class.java)
            startActivity(intent)
        }


    }
}