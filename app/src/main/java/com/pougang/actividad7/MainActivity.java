package com.pougang.actividad7;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerProducts;
    private ProductAdapter productAdapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setupProducts();
        setupRecyclerView();
    }

    private void initViews() {
        recyclerProducts = findViewById(R.id.recyclerProducts);
    }

    private void setupProducts() {
        productList = new ArrayList<>();
        productList.add(new Product(
                "\uD83D\uDCA9 Tu amigo Pou!!!",
                "Te observa mientras duermes y más!",
                "https://m.media-amazon.com/images/I/31kBKYrIjiL._AC_SX679_.jpg",
                "https://a.co/d/fIM0EpO"
        ));
        productList.add(new Product(
                "◓ Comprame no es pregunta",
                "No es opcional",
                "https://m.media-amazon.com/images/I/81njgY0InCL._AC_SX679_.jpg",
                "https://a.co/d/g5xMsa3"
        ));
        productList.add(new Product(
                "☭ Nuestro manifiesto",
                "Nuestra guía hacia el futuro",
                "https://m.media-amazon.com/images/I/61wRbhr5-ZL._SY466_.jpg",
                "https://a.co/d/8Y2R2rM"
        ));
        productList.add(new Product(
                "\uD83C\uDF0C Pesar",
                "Ya oiste a la dama, persigue y asesina al profeta",
                "https://m.media-amazon.com/images/I/81Qzhg6n3rL._AC_SY741_.jpg",
                "https://a.co/d/8MJnJwL"
        ));
        productList.add(new Product(
                "☣ Gravemind",
                "Esta no es tu tumba, pero eres bienvenida en ella",
                "https://m.media-amazon.com/images/I/71NJhL2V0CL._SY425_.jpg",
                "https://www.amazon.com.mx/Halo-Flood-William-C-Dietz/dp/1982111631/ref=sr_1_5?crid=2JG03KUQPN9D4&dib=eyJ2IjoiMSJ9.ca1KpIkwmM82sNkaG3pMWP-ueqfwOw6U-QTyMJVZ0obZpCG_ndix-Neve8AcxpykBaNsySLwccCtGZE8zGKcKHfJiGQ2ziZxxUfvfeUCXan5ieAMGOW3YTjLX4fCvQVVvATJ-YcEkUFAepYJ9OieD9ap5mzWsHRfoGf8LMEIZ6OPnSWSGgCPES1NrF6jkhZQ.y2JiSck_eFNAIlpayETHHlhckkacV2J8y_zH3x8tnHM&dib_tag=se&keywords=halo+primordium&qid=1759635807&sprefix=halo+primo%2Caps%2C174&sr=8-5&ufe=app_do%3Aamzn1.fos.de93fa6a-174c-4df7-be7c-5bc8e9c5a71b"
        ));
    }

    private void setupRecyclerView() {
        productAdapter = new ProductAdapter(this, productList);
        recyclerProducts.setLayoutManager(new LinearLayoutManager(this));
        recyclerProducts.setAdapter(productAdapter);
    }
}