import React, {useState, useEffect} from "react"
import DeveloperTile from "./DeveloperTile"

const DevelopersList = props => {
    const [developers, setDevelopers] = useState([])
    const getDevelopers =  async () => {
        try{
            const response = await fetch("/api/v1/aboutUs")
            if(!response.ok){
                const errMessage = `${response.status} (${response.statusText})`
                const err = new Error(errMessage)
                throw err
            }
            const responseBody = await response.json()
            setDevelopers(responseBody)
        } catch (err) {
            console.error(`Could not complete data fetch.`)
        }
    }

    useEffect(() => {
        getDevelopers()
    }, [props])

    const developerCards = developers.map(developer => {
        return <DeveloperTile
        key = {developer.id}
        devName = {developer.name}
        devImg = {developer.imgUrl}
        aboutDev = {developer.about}
        />
    })

    return (
        <div>
            {developerCards}
        </div>
    )
}

export default DevelopersList