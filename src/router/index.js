import React from 'react'
import { StyleSheet, Text, View } from 'react-native'
import { createStackNavigator } from '@react-navigation/stack';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import Home from '../pages/Home';
import Splash from '../pages/Splash';
import Akademik from '../pages/Akademik';
import Jadwal from '../pages/Jadwal';
import Profil from '../pages/Profil';
import Notif from '../pages/Notif';

const Stack = createStackNavigator();
const Tab = createBottomTabNavigator();

const MainApp = () => {
    return (
      <Tab.Navigator>
        <Tab.Screen name="Home" component={Home} />
        <Tab.Screen name="Akademik" component={Akademik} />
        <Tab.Screen name="Jadwal" component={Jadwal} />
        <Tab.Screen name="Profil" component={Profil} />
        <Tab.Screen name="Notif" component={Notif} />
      </Tab.Navigator>
    )
}

const Router = () => {
    return (
        <Stack.Navigator initialRouteName="MainApp">
            <Stack.Screen name="Splash" component={Splash} options={{headerShown:false}}/>
            <Stack.Screen name="MainApp" component={MainApp} options={{headerShown:false}}/>
        </Stack.Navigator>
    )
}

export default Router

const styles = StyleSheet.create({})
