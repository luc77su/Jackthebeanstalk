package com.first_project.jackthebeanstalk

import android.os.Parcel
import android.os.Parcelable

class new () : Parcelable {
    

    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<new> {
        override fun createFromParcel(parcel: Parcel): new {
            return new(parcel)
        }

        override fun newArray(size: Int): Array<new?> {
            return arrayOfNulls(size)
        }
    }
}