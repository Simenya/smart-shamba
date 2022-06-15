package com.app.smartshamba.fragments

class DiscoverDataStore {
    lateinit var overview:Array<String>
    var preparations:Array<String>? = null
    var pestControl:Array<String>? = null
    var harvesting:Array<String>? = null
    var conclusion:Array<String>? = null
    var title7:Array<String>? = null
    var descOverview:Array<String>? = null
    var descPreparation:Array<String>? = null
    var descPestControl:Array<String>? = null
    var descHarvesting:Array<String>? = null
    var desc5Conclusion:Array<String>? = null
    var desc6:Array<String>? = null
    var desc7:Array<String>? = null

    fun dataStore(){
        overview = arrayOf(
            "Overview", "Preparation", "Disease Control", "Harvesting", "Conclusion"
        )
        preparations

    }
}