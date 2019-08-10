package com.volvoxglobator.androidosguide

data class OSModel(val img: Int,
                   val versionName: String,
                   val apiLevel: Int,
                   val description: Int
)


val os_list = listOf(
    OSModel(R.drawable.os_cupcake, "Cupcake", R.string.desc_cupcake, R.string.api_cupcake),
    OSModel(R.drawable.os_donut, "Donut", R.string.desc_donut, R.string.api_donut),
    OSModel(R.drawable.os_eclair, "Eclair", R.string.desc_eclair, R.string.api_eclair),
    OSModel(R.drawable.os_froyo, "Froyo", R.string.desc_froyo, R.string.api_froyo),
    OSModel(
        R.drawable.os_gingerbread,
        "Gingerbread",
        R.string.desc_gingerbread,
        R.string.api_gingerbread
    ),
    OSModel(R.drawable.os_honeycomb, "Honeycomb", R.string.desc_honeycomb, R.string.api_honeycomb),
    OSModel(
        R.drawable.os_icecreamsandwich,
        "Ice Cream Sandwich",
        R.string.desc_ics,
        R.string.api_ics
    ),
    OSModel(R.drawable.os_jellybean, "Jellybean", R.string.desc_jellybean, R.string.api_jellybean),
    OSModel(R.drawable.os_kitkat, "Kitkat", R.string.desc_kitkat, R.string.api_kitkat),
    OSModel(R.drawable.os_lolipop, "Lollipop", R.string.desc_lollipop, R.string.api_lollipop),
    OSModel(
        R.drawable.os_marsmallow,
        "Marsmallow",
        R.string.desc_marsmallow,
        R.string.api_marsmallow
    ),
    OSModel(R.drawable.os_nougat, "Nougat", R.string.desc_nougat, R.string.api_nougat),
    OSModel(R.drawable.os_oreo, "Oreo", R.string.desc_oreo, R.string.api_oreo),
    OSModel(R.drawable.os_pie, "Pie", R.string.desc_pie, R.string.api_pie)
)