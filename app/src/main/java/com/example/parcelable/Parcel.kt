package com.example.parcelable

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Parcel(var id:Int, var name:String) : Parcelable