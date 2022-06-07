import { ThemeProvider } from '@mui/material'
import type { AppProps } from 'next/app'
import Cabecalho from '../ui/components/Cabecalho/Cabecalho';
import Lista from '../ui/components/Lista/Lista';

import '../ui/styles/globals.css'
import tema from '../ui/themes/tema'

function MyApp({ Component, pageProps }: AppProps) {
  return (
    <ThemeProvider theme = { tema } >
      <Cabecalho />   
      <Component {...pageProps} />
      <Lista pets={[]} />
  </ThemeProvider>
);
}

export default MyApp
