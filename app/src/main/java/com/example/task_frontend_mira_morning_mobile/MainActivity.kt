package com.example.task_frontend_mira_morning_mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.task_frontend_mira_morning_mobile.body.About
import com.example.task_frontend_mira_morning_mobile.body.BerandaBodyScreen
import com.example.task_frontend_mira_morning_mobile.body.Detail20Holistic
import com.example.task_frontend_mira_morning_mobile.body.DetailAngkot
import com.example.task_frontend_mira_morning_mobile.body.DetailBuyaHamka
import com.example.task_frontend_mira_morning_mobile.body.DetailCahayaHutan
import com.example.task_frontend_mira_morning_mobile.body.DetailCounsels
import com.example.task_frontend_mira_morning_mobile.body.DetailDeepNutrision
import com.example.task_frontend_mira_morning_mobile.body.DetailDepression
import com.example.task_frontend_mira_morning_mobile.body.DetailDhirga
import com.example.task_frontend_mira_morning_mobile.body.DetailFiksiImperfect
import com.example.task_frontend_mira_morning_mobile.body.DetailFiksiPergi
import com.example.task_frontend_mira_morning_mobile.body.DetailHellHouse
import com.example.task_frontend_mira_morning_mobile.body.DetailJiwaNegarawan
import com.example.task_frontend_mira_morning_mobile.body.DetailKamus
import com.example.task_frontend_mira_morning_mobile.body.DetailKartini
import com.example.task_frontend_mira_morning_mobile.body.DetailNelsonMandela
import com.example.task_frontend_mira_morning_mobile.body.DetailPanglima
import com.example.task_frontend_mira_morning_mobile.body.DetailPengantarIlmu
import com.example.task_frontend_mira_morning_mobile.body.DetailPuisiCinta
import com.example.task_frontend_mira_morning_mobile.body.DetailPulang
import com.example.task_frontend_mira_morning_mobile.body.DetailRindu
import com.example.task_frontend_mira_morning_mobile.body.DetailSalamTerakhir
import com.example.task_frontend_mira_morning_mobile.body.DetailSapiens
import com.example.task_frontend_mira_morning_mobile.body.DetailSiJuki
import com.example.task_frontend_mira_morning_mobile.body.DetailSoeharto
import com.example.task_frontend_mira_morning_mobile.body.DetailSpace
import com.example.task_frontend_mira_morning_mobile.body.DetailSpacedum
import com.example.task_frontend_mira_morning_mobile.body.DetailThoseEyes
import com.example.task_frontend_mira_morning_mobile.body.DetailTotalHealth
import com.example.task_frontend_mira_morning_mobile.body.Koleksi
import com.example.task_frontend_mira_morning_mobile.view.ListBuku

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = "BerandaBodyScreen"
            ) {

                composable("beranda") { BerandaBodyScreen(navController) }
                composable("list_buku") { ListBuku(navController) }
                composable("detail_20holistic") { Detail20Holistic(navController) }
                composable("detail_angkot") { DetailAngkot(navController) }
                composable("detail_buya_hamka") { DetailBuyaHamka(navController) }
                composable("detail_cahaya_hutan") { DetailCahayaHutan(navController) }
                composable("detail_counsels") { DetailCounsels(navController) }
                composable("detail_deep_nutrision") { DetailDeepNutrision(navController) }
                composable("detail_depression") { DetailDepression(navController) }
                composable("detail_dhirga") { DetailDhirga(navController) }
                composable("detail_fiksi_imperfect") { DetailFiksiImperfect(navController) }
                composable("detail_fiksi_pergi") { DetailFiksiPergi(navController) }
                composable("detail_hell_house") { DetailHellHouse(navController) }
                composable("detail_jiwa_negarawan") { DetailJiwaNegarawan(navController) }
                composable("detail_kamus") { DetailKamus(navController) }
                composable("detail_kartini") { DetailKartini(navController) }
                composable("detail_nelson_mandela") { DetailNelsonMandela(navController) }
                composable("detail_panglima") { DetailPanglima(navController) }
                composable("detail_pengantar_ilmu") { DetailPengantarIlmu(navController) }
                composable("detail_puisi_cinta") { DetailPuisiCinta(navController) }
                composable("detail_pulang") { DetailPulang(navController) }
                composable("detail_rindu") { DetailRindu(navController) }
                composable("detail_salam_terakhir") { DetailSalamTerakhir(navController) }
                composable("detail_space") { DetailSpace(navController) }
                composable("detail_sapiens") { DetailSapiens(navController) }
                composable("detail_si_juki") { DetailSiJuki(navController) }
                composable("detail_soeharto") { DetailSoeharto(navController) }
                composable("detail_spacedum") { DetailSpacedum(navController) }
                composable("detail_those_eyes") { DetailThoseEyes(navController) }
                composable("detail_total_health") { DetailTotalHealth(navController) }


                // Koleksi Screens
                composable("koleksi") { Koleksi(navController) }



                // About Screens
                composable("about") { About(navController) }

            }
        }
    }
}


