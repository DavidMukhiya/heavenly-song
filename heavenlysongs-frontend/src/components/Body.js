import React from 'react'
import RandomLyrics from '../features/RandomLyrics'

const Body = () => {
  return (
    <div style={{ 
        border: '2px solid black',
        padding: '10px',
        width: '100%',
        height: 'calc(100vh - 150px)', // Subtract header and footer height
        display: 'flex',
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: 'white',
        borderRadius: '10px',
      }}>
      <RandomLyrics />
    </div>
  )
}

export default Body
