import React, {useState, useEffect } from "react"
import TrailTile from "./TrailTile.js"

const TrailsList = props => {
    const [trails, setTrails] = useState([])
    const getTrails = async () => {
        try{
            const response = await fetch("/api/v1/trails")
            if (!response.ok) {
                const errMessage = `${response.status} (${response.statusText})`
                const err = new Error(errMessage)
                throw err
            }
            const responseBody = await response.json()
            setTrails(responseBody)
        } catch (err) {
            console.error(`Could not complete data fetch.`)
        }
    }

    useEffect(() => {
        getTrails()
    }, [props])

    const trailObjects = trails.map(trail => {
        return <TrailTile
        key ={trail.id}
        id = {trail.id}
        trailName ={trail.name}
        difficultyRating = {trail.difficultyRating}
        familyFriendly = {trail.familyFriendly}
        petFriendly={trail.petFriendly}
        />
    })

    return (
        <div >
            {trailObjects}
        </div>
    )
}

export default TrailsList