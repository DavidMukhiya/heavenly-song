import React from 'react';

const RandomLyrics = () => {
  return (
    <div 
      style={{
        border: '2px solid transparent',
        borderRadius: '10px',
        backgroundColor: '#E3DDDC',
        width: '85%',
        height: '80%',
        margin: '0 auto',
        display: 'flex',
        flexDirection: 'column',
        justifyContent: 'center',
        alignItems: 'center',
      }}
    >
      <div 
        style={{
          border: '2px solid transparent',
          borderRadius: '10px',
          backgroundColor: '#E3DDDC',
          padding: '10px',
          marginBottom: '10px',
        }}
      >
        <h2 
          style={{
            fontWeight: 'bold',
            color: '#2F3B69',
            margin: '0',
          }}
        >
          Random Lyrics
        </h2>
      </div>
      <div 
        style={{
          display: 'flex',
          flexDirection: 'column',
          justifyContent: 'center',
          alignItems: 'center',
        }}
      >
        <p style={{ textAlign: 'center' }}>
          "I can't get no satisfaction" <br />
          "Imagine all the people living life in peace" <br />
          "She loves you, yeah, yeah, yeah" <br />
          "Don't stop believin', hold on to that feelin'" <br />
          "Like a virgin, touched for the very first time" <br />
          "I will always love you" <br />
          "Sweet dreams are made of this" <br />
          "We're not gonna take it, no, we ain't gonna take it" <br />
          "Every breath you take, every move you make, I'll be watching you" <br />
          "Take on me, take me on"
        </p>
      </div>
    </div>
  );
}

export default RandomLyrics;
