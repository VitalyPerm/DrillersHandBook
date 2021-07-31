package com.elvitalya.drillershandbook.model

import com.elvitalya.drillershandbook.R


val theme1: Themes = Themes("Начало: общие разговорные понятия и фразы",  R.drawable.ic_theme_1)
val theme2: Themes = Themes("Приветствие, прощание, благодарность, извинение, формулы вежливости ", R.drawable.ic_theme_2)
val theme3: Themes = Themes("Знакомство и формы обращения по-английски", R.drawable.ic_theme_3)





 fun addThemes(): List<Themes>{
     return listOf(theme1, theme2, theme3)
}