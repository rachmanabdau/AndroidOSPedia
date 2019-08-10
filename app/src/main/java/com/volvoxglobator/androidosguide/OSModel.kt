package com.volvoxglobator.androidosguide

data class OSModel(val img: Int,
                   val versionName: String,
                   val apiLevel: Int,
                   val description: Int
)


val os_list = listOf(
    OSModel(R.drawable.os_cupcake, "Cupcake", R.string.api_cupcake, R.string.desc_cupcake),
    OSModel(R.drawable.os_donut, "Donut", R.string.api_donut, R.string.desc_donut),
    OSModel(R.drawable.os_eclair, "Eclair", R.string.api_eclair, R.string.desc_eclair),
    OSModel(R.drawable.os_froyo, "Froyo", R.string.api_froyo, R.string.desc_froyo),
    OSModel(
        R.drawable.os_gingerbread,
        "Gingerbread",
        R.string.api_gingerbread,
        R.string.desc_gingerbread
    ),
    OSModel(R.drawable.os_honeycomb, "Honeycomb", R.string.desc_honeycomb, R.string.api_honeycomb),
    OSModel(
        R.drawable.os_icecreamsandwich,
        "Ice Cream Sandwich",
        R.string.api_ics,
        R.string.desc_ics
    ),
    OSModel(R.drawable.os_jellybean, "Jellybean", R.string.api_jellybean, R.string.desc_jellybean),
    OSModel(R.drawable.os_kitkat, "Kitkat", R.string.api_kitkat, R.string.desc_kitkat),
    OSModel(R.drawable.os_lolipop, "Lollipop", R.string.api_lollipop, R.string.desc_lollipop),
    OSModel(
        R.drawable.os_marsmallow,
        "Marsmallow",
        R.string.api_marsmallow,
        R.string.desc_marsmallow
    ),
    OSModel(R.drawable.os_nougat, "Nougat", R.string.api_nougat, R.string.desc_nougat),
    OSModel(R.drawable.os_oreo, "Oreo", R.string.api_oreo, R.string.desc_oreo),
    OSModel(R.drawable.os_pie, "Pie", R.string.api_pie, R.string.desc_pie)
)