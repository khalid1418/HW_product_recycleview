package com.example.hw_product_recycleview.data

import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.model.Phone

class DataSource {



    fun Loadinformation():List<Phone>{
        return listOf(

            Phone(R.drawable.iphone, "Iphone 12 64GB","4500SR",true,5),
            Phone(R.drawable.samsung_galaxy_uitra,"Samsung Galaxy S21 Ultra","4500SR",false,5),
            Phone(R.drawable.xiaomi_pro,"Xiaomi 11T Pro","2000SR",true,0),
            Phone(R.drawable.huawei_yp,"Huawei Y6p","500SR",false,0),
            Phone(R.drawable.samsung_galaxy_z_flip,"Samsung Galaxy Z Flip3","5000SR",true,70),
            Phone(R.drawable.iphone13,"Iphone 13","6000SR",true,36)








        )


    }
}