package com.example.hw_product_recycleview.data

import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.model.Phone

class DataSource {



    fun Loadinformation():List<Phone>{
        return listOf(

            Phone(R.drawable.iphone, R.string.phone1,"4500SR",true,5),
            Phone(R.drawable.samsung_galaxy_uitra,R.string.phone2,"4500SR",false,5),
            Phone(R.drawable.xiaomi_pro,R.string.phone3,"2000SR",true,0),
            Phone(R.drawable.huawei_yp,R.string.phone4,"500SR",false,0),
            Phone(R.drawable.samsung_galaxy_z_flip,R.string.phone5,"5000SR",true,70),
            Phone(R.drawable.iphone13,R.string.phone6,"6000SR",true,36)








        )


    }
}