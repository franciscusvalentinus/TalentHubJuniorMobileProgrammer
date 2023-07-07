package com.mrx.gamestoday.db

import com.mrx.gamestoday.R
import com.mrx.gamestoday.model.GenshinChar

object CharData {
    private val database = arrayOf(
            arrayOf(
                    "Franciscus",
                    "Vision: Geo",
                    "Affiliation: Knights of Favonius",
                    "Albedo is an alchemist based in Mondstadt, in the service of the Knights of Favonius. \"Genius,\" \"Kreideprinz,\" or \"Captain of the Investigation Team\"... Such titles and honors are of no consequence to him when there is so much more research to conduct. The pursuit of fortune and connections cannot hold a candle to his heart's desire — acquiring the limitless, obscure knowledge left behind by previous generations of scholars.",
                    "9/13",
                    "Sword",
                    R.drawable.albedo,
                    R.drawable.albedobg,
                    R.drawable.geo,
                    "https://genshin.mihoyo.com/en/character/mondstadt?char=15"
            ),
            arrayOf(
                    "Vincent",
                    "Vision: Hydro",
                    "Affiliation: Fatui",
                    "Meet Tartaglia the cunning Snezhnayan whose unpredictable personality keeps people guessing his every move. Don't be under any illusion as to what he might be thinking or what his intentions are. Just remember this: Behind that innocent, childlike exterior lies a finely honed instrument of war. ",
                    "7/20",
                    "Bow",
                    R.drawable.childe,
                    R.drawable.childebg,
                    R.drawable.hydro,
                    "https://genshin.mihoyo.com/en/character/liyue?char=8"
            ),
            arrayOf(
                    "Sahlan",
                    "Vision: Pyro",
                    "Affiliation: Dawn Winery",
                    "As the wealthiest gentleman in Mondstadt, the ever-dapper Diluc always presents himself as the epitome of perfection. But behind the courteous visage burns a zealous soul that has sworn to protect Mondstadt at all costs, allowing him to mercilessly vanquish all who threaten his city. ",
                    "4/30",
                    "Claymore",
                    R.drawable.diluc,
                    R.drawable.dilucbg,
                    R.drawable.pyro,
                    "https://genshin.mihoyo.com/en/character/mondstadt?char=5"
            ),
            arrayOf(
                    "Farrel",
                    "Vision: Cryo",
                    "Affiliation: Yuehai Pavilion",
                    "The secretary to the Liyue Qixing. The blood of both human and illuminated beast flows within her veins. Graceful and quiet by nature, yet the gentle disposition of qilin sees not even the slightest conflict with even the most arduous of workloads.After all, Ganyu firmly believes that all the work she does is in honor of her contract with Rex Lapis, seeking the well-being of all living things within Liyue.",
                    "12/2",
                    "Bow",
                    R.drawable.ganyu,
                    R.drawable.ganyubg,
                    R.drawable.cryo,
                    "https://genshin.mihoyo.com/en/character/liyue?char=11"
            ),
            arrayOf(
                    "Bagus",
                    "Vision: Pyro",
                    "Affiliation: Wangsheng Funeral Parlor",
                    "Hu Tao is the 77th Director of the Wangsheng Funeral Parlor, a person vital to managing Liyue's funerary affairs. She does her utmost to flawlessly carry out a person's last rites and preserve the world's balance of yin and yang. Aside from this, she is also a talented poet whose many \"masterpieces\" have passed around Liyue's populace by word of mouth. ",
                    "7/15",
                    "Polearm",
                    R.drawable.hutao,
                    R.drawable.hutaobg,
                    R.drawable.pyro,
                    "https://genshin.mihoyo.com/en/character/liyue?char=12"
            ),
            arrayOf(
                    "Alfredo",
                    "Vision: Anemo",
                    "Affiliation: Knights of Favonius",
                    "As the Acting Grand Master of the Knights, Jean has always been devoted to her duties and maintaining peace in Mondstadt. She had taken precautions long before the onset of Stormterror's assault, and she will guard Mondstadt with her life as always.",
                    "3/14",
                    "Sword",
                    R.drawable.jean,
                    R.drawable.jeanbg,
                    R.drawable.anemo,
                    "https://genshin.mihoyo.com/en/character/mondstadt?char=0"
            ),
            arrayOf(
                    "Firman",
                    "Vision: Electro",
                    "Affiliation: Liyue Qixing",
                    "The Yuheng of the Liyue Qixing. Keqing has much to say about Rex Lapis' unilateral approach to policymaking in Liyue but in truth, gods admire skeptics such as her quite a lot. She firmly believes that humanity's future should be determined by humans themselves, and that they can even do better than the archons and adepti have done for them. In order to prove this, she works harder than anyone else.",
                    "11/20",
                    "Sword",
                    R.drawable.keqing,
                    R.drawable.keqingbg,
                    R.drawable.electro,
                    "https://genshin.mihoyo.com/en/character/liyue?char=7"
            ),
            arrayOf(
                    "Alfindi",
                    "Vision: Pyro",
                    "Affiliation: Knights of Favonius",
                    "Knights of Favonius Spark Knight! Forever with a bang and a flash! And then disappearing from the stern gaze of Acting Grand Master Jean. But it'd still be better to not be in solitary in the first place.",
                    "7/27",
                    "Catalyst",
                    R.drawable.klee,
                    R.drawable.kleebg,
                    R.drawable.pyro,
                    "https://genshin.mihoyo.com/en/character/mondstadt?char=8"
            ),
            arrayOf(
                    "Bryant",
                    "Vision: Hydro",
                    "Affiliation: Mondstadt",
                    "A mysterious young astrologer who proclaims herself to be \"Astrologist Mona Megistus,\" and who possesses abilities to match the title. Erudite, but prideful. Though she is often strapped for cash and lives a life of thrift, she is resolved to never use astrology for profit... It is this very resolution that has caused her to constantly fret about money.",
                    "8/31",
                    "Catalyst",
                    R.drawable.mona,
                    R.drawable.monabg,
                    R.drawable.hydro,
                    "https://genshin.mihoyo.com/en/character/mondstadt?char=13"
            ),
            arrayOf(
                    "Javier",
                    "Vision: Cryo",
                    "Affiliation: Bubu Pharmacy",
                    "An apprentice and herb gatherer at Bubu Pharmacy. \"Blessed\" by the adepti with a body that cannot die, this petite zombie cannot do anything without first giving herself orders to do it. Qiqi's memory is like a sieve. Out of necessity, she always carries around a notebook in which she writes anything important that she is sure to forget later. But on her worst days, she even forgets to look at her notebook...",
                    "3/3",
                    "Sword",
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