package com.example.chapter3_topic2

import android.os.Parcel
import android.os.Parcelable

class PersonParcelAble(val nama: String?, val umur: Int, val kota: String?) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeInt(umur)
        parcel.writeString(kota)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PersonParcelAble> {
        override fun createFromParcel(parcel: Parcel): PersonParcelAble {
            return PersonParcelAble(parcel)
        }

        override fun newArray(size: Int): Array<PersonParcelAble?> {
            return arrayOfNulls(size)
        }
    }
}