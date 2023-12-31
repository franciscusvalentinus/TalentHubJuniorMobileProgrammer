package com.mrx.gamestoday.db

import com.mrx.gamestoday.R
import com.mrx.gamestoday.model.GenshinChar

object CharData {
    private val database = arrayOf(
            arrayOf(
                    "Franciscus",
                    "franciscus@gmail.com",
                    "Jurusan : Informatika",
                    "",
                    "8",
                    "",
                    R.drawable.albedo,
                    R.drawable.albedobg,
                    R.drawable.geo,
                    "https://genshin.mihoyo.com/en/character/mondstadt?char=15"
            ),
            arrayOf(
                    "Vincent",
                    "vincent@gmail.com",
                    "Jurusan : Manajemen Bisnis",
                    "",
                    "10",
                    "",
                    R.drawable.childe,
                    R.drawable.childebg,
                    R.drawable.hydro,
                    "https://genshin.mihoyo.com/en/character/liyue?char=8"
            ),
            arrayOf(
                    "Sahlan",
                    "sahlan@gmail.com",
                    "Jurusan : Manajemen Bisnis",
                    "",
                    "10",
                    "",
                    R.drawable.diluc,
                    R.drawable.dilucbg,
                    R.drawable.pyro,
                    "https://genshin.mihoyo.com/en/character/mondstadt?char=5"
            ),
            arrayOf(
                    "Farrel",
                    "farrel@gmail.com",
                    "Jurusan : Desain Komunikasi Visual",
                    "",
                    "8",
                    "",
                    R.drawable.ganyu,
                    R.drawable.ganyubg,
                    R.drawable.cryo,
                    "https://genshin.mihoyo.com/en/character/liyue?char=11"
            ),
            arrayOf(
                    "Bagus",
                    "bagus@gmail.com",
                    "Jurusan : Desain Komunikasi Visual",
                    "",
                    "10",
                    "",
                    R.drawable.hutao,
                    R.drawable.hutaobg,
                    R.drawable.pyro,
                    "https://genshin.mihoyo.com/en/character/liyue?char=12"
            ),
            arrayOf(
                    "Alfredo",
                    "alfredo@gmail.com",
                    "Jurusan : Arsitektur",
                    "",
                    "8",
                    "",
                    R.drawable.jean,
                    R.drawable.jeanbg,
                    R.drawable.anemo,
                    "https://genshin.mihoyo.com/en/character/mondstadt?char=0"
            ),
            arrayOf(
                    "Firman",
                    "firman@gmail.com",
                    "Jurusan : Arsitektur",
                    "",
                    "10",
                    "",
                    R.drawable.keqing,
                    R.drawable.keqingbg,
                    R.drawable.electro,
                    "https://genshin.mihoyo.com/en/character/liyue?char=7"
            ),
            arrayOf(
                    "Alfindi",
                    "alfindi@gmail.com",
                    "Jurusan : Informatika",
                    "",
                    "10",
                    "",
                    R.drawable.klee,
                    R.drawable.kleebg,
                    R.drawable.pyro,
                    "https://genshin.mihoyo.com/en/character/mondstadt?char=8"
            ),
            arrayOf(
                    "Bryant",
                    "bryant@gmail.com",
                    "Jurusan : Desain Komunikasi Visual",
                    "",
                    "8",
                    "",
                    R.drawable.mona,
                    R.drawable.monabg,
                    R.drawable.hydro,
                    "https://genshin.mihoyo.com/en/character/mondstadt?char=13"
            ),
            arrayOf(
                    "Javier",
                    "javier@gmail.com",
                    "Jurusan : Arsitektur",
                    "",
                    "8",
                    "",
                    R.drawable.qiqi,
                    R.drawable.qiqibg,
                    R.drawable.cryo,
                    "https://genshin.mihoyo.com/en/character/liyue?char=6"
            )
    )

    val listData: ArrayList<GenshinChar>
        get(){
                val list = ArrayList<GenshinChar>()
                for (data in database) {
                        val genshinChar = GenshinChar()
                        genshinChar.name = data[0] as String
                        genshinChar.visions = data[1] as String
                        genshinChar.affiliation = data[2] as String
                        genshinChar.bio = data[3] as String
                        genshinChar.birth = data[4] as String
                        genshinChar.weapon = data[5] as String
                        genshinChar.pic = data[6] as Int
                        genshinChar.background = data[7] as Int
                        genshinChar.element = data[8] as Int
                        genshinChar.charlink = data[9] as String

                        list.add(genshinChar)
                }
                return list
        }
}